package practise.cache;

import practise.cache.cache.Cache;
import practise.cache.model.Pokemon;
import practise.cache.policy.WriteThroughPolicy;
import practise.cache.store.CacheStore;
import practise.cache.store.DBStore;
import practise.cache.store.PokemonCacheStore;
import practise.cache.strategy.LRUEvictionStrategy;

import java.util.concurrent.*;
import java.util.*;

public class Main {

    // Fixed pool size
    private static final int NUM_EXECUTORS = 4;
    private static final ExecutorService[] executors = new ExecutorService[NUM_EXECUTORS];

    static {
        for (int i = 0; i < NUM_EXECUTORS; i++) {
            int finalI = i;
            executors[i] = Executors.newSingleThreadExecutor(
                    r -> new Thread(r, "KeyWorker-" + finalI)
            );
        }
    }

    public static void main(String[] args) {
        // In-memory cache store
        final CacheStore<String, Pokemon> cacheStore = new PokemonCacheStore(
                new LRUEvictionStrategy<>()
        );

        DBStore<String, Pokemon> dbStore = new DBStore<>();
        var policy = new WriteThroughPolicy<String, Pokemon>();

        // Build cache
        Cache<String, Pokemon> cache = new Cache<>(cacheStore, dbStore, policy);

        // ========= Simulate concurrent requests =========
        List<String> keys = Arrays.asList("Pikachu1", "Pikachu2", "Charmander", "Bulbasaur");

        for (int i = 0; i < 12; i++) {
            String key = keys.get(i % keys.size());
            int id = i;

            submitRequest(key, () -> {
                cache.put(key, new Pokemon());
                System.out.println(Thread.currentThread().getName() +
                        " -> PUT " + key);

                Pokemon p = cache.get(key);
                System.out.println(Thread.currentThread().getName() +
                        " -> GET " + key + " => " + p);
            });
        }

        shutdownExecutors();
    }

    /**
     * Deterministically assign a key to an executor index.
     */
    public static int getExecutorIndexForKey(Object key) {
        return Math.abs(key.hashCode() % NUM_EXECUTORS);
    }

    /**
     * Submit request ensuring same key always goes to same executor.
     */
    private static void submitRequest(String key, Runnable task) {
        int executorIndex = getExecutorIndexForKey(key);
        executors[executorIndex].submit(task);
    }

    private static void shutdownExecutors() {
        for (ExecutorService executor : executors) {
            executor.shutdown();
        }
    }
}
