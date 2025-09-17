package practise.cache.policy;

import practise.cache.store.CacheStore;
import practise.cache.store.DBStore;

public class WriteThroughPolicy<K, V> implements WritePolicy<K, V> {

    @Override
    public void write(K key, V value, DBStore<K, V> dbStore, CacheStore<K, V> cache) {
        // write to cache
        cache.set(key, value);
        // immediately write to DB
        dbStore.add(key, value);
    }

    @Override
    public void delete(K key, DBStore<K, V> dbStore, CacheStore<K, V> cache) {
        cache.delete(key);
        dbStore.delete(key);
    }

    @Override
    public V read(K key, DBStore<K, V> dbStore, CacheStore<K, V> cache) {
        V value = cache.get(key);
        if (value == null) {
            // cache miss → fetch from DB and update cache
            value = dbStore.get(key);
            if (value != null) {
                cache.set(key, value);
            }
        }
        return value;
    }
}

