package practise.cache.store;

/**
 * CacheStore interface with basic operations.
 * @param <K> Key type
 * @param <V> Value type
 */
public interface CacheStore<K, V> {

    /**
     * Stores a value in cache against the given key.
     */
    void set(K key, V value);

    /**
     * Retrieves a value from cache by key.
     */
    V get(K key);

    /**
     * Deletes a value from cache by key.
     */
    void delete(K key);

}

