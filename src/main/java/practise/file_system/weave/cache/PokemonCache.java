package practise.cache.store;

import com.weave.exceptions.PokemonNotFoundException;
import com.weave.strategy.EvictionStrategy;
import practise.cache.model.Pokemon;
import practise.cache.store.CacheStore;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Cache implementation for Pokemon data using pluggable eviction strategy.
 */

// Note - Handling concurrency using Concurrent collections provided by java and
// locks when modify the internal state of cache.

public class PokemonCache implements CacheStore<String, Pokemon> {

    private final int capacity;

    // Thread safe hash map - segmented locking
    private final ConcurrentHashMap<String, Pokemon> cache;
    private final EvictionStrategy<String> evictionStrategy;

    // ReentrantLock fo handling eviction.
    private final Object evictionLock = new Object();
    public PokemonCache(EvictionStrategy<String> evictionStrategy) {
        // this can be made configurable on application - bootup
        // currently hardcoding to 5 as default.
        this.capacity = 5;
        this.cache = new ConcurrentHashMap<>();
        this.evictionStrategy = evictionStrategy;
    }

    @Override
    public void set(String key, Pokemon pokemon) {
        if (cache.size() >= capacity && !cache.containsKey(key)) {

            // make eviction thread safe
            synchronized (evictionLock) {
                String evictKey = evictionStrategy.evictKey();
                if (evictKey != null) {
                    cache.remove(evictKey);
                    System.out.println("Evicted: " + evictKey);
                }
            }

        }

        cache.put(key, pokemon);
        evictionStrategy.keyAccessed(key);
    }

    @Override
    public Pokemon get(String key) {
        if (cache.containsKey(key)) {
            synchronized (evictionLock) {
                evictionStrategy.keyAccessed(key);
            }
            return cache.get(key);
        }
        throw new PokemonNotFoundException( String.format("Pokemon with key " +
                "'%s' does not exist in cache.", key));
    }

    @Override
    public void delete(String key) {
        if (cache.containsKey(key)) {
            cache.remove(key);
            synchronized (evictionLock) {
                evictionStrategy.removeKey(key);
            }
            System.out.println("Deleted: " + key);
        }
        // else depends on business use-case, should throw exception or simply return.
    }

    public ConcurrentHashMap<String, Pokemon> getCache() {
        return cache;
    }
}
