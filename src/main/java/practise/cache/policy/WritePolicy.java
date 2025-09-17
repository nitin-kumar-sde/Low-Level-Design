package practise.cache.policy;

import practise.cache.store.CacheStore;
import practise.cache.store.DBStore;

public interface WritePolicy<K, V> {

    // write into cache +  DB store
    void write(K key, V value, DBStore<K, V> dbStore, CacheStore<K, V> cache);

    // delete from cache +  DB
    void delete(K key, DBStore<K, V> dbStore, CacheStore<K, V> cache);

    // read from cache or DB depending on policy
    V read(K key, DBStore<K, V> dbStore, CacheStore<K, V> cache);
}
