package practise.cache.cache;


import practise.cache.policy.WritePolicy;
import practise.cache.store.CacheStore;
import practise.cache.store.DBStore;

public class Cache<K, V> {

    private final CacheStore<K, V> cacheStore;   // in-memory cache
    private final DBStore<K, V> dbStore;      // persistent store (mocked here)
    private final WritePolicy<K, V> policy;      // strategy

    public Cache(CacheStore<K, V> cacheStore,
                 DBStore<K, V> dbStore,
                 WritePolicy<K, V> policy) {
        this.cacheStore = cacheStore;
        this.dbStore = dbStore;
        this.policy = policy;
    }

    public V get(K key) {
        return policy.read(key, dbStore, cacheStore);
    }

    public void put(K key, V value) {
        policy.write(key, value, dbStore, cacheStore);
    }

    public void delete(K key) {
        policy.delete(key, dbStore, cacheStore);
    }
}

