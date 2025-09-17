package practise.cache.store;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Simulated DB layer that implements CacheStore.
 * In real-world usage this would connect to a DB or external persistence.
 */
public class DBStore <K, V> {

    // simulates a DAO layer.
    private final ConcurrentMap<K, V> db;

    public DBStore() {
        this.db = new ConcurrentHashMap<>();
    }

    public void add(K key, V value) {
        System.out.println("[DBStore] Writing to DB: key=" + key + ", value=" + value);
        db.put(key, value);
    }

    public V get(K key) {
        V value = db.get(key);
        System.out.println("[DBStore] Reading from DB: key=" + key + ", value=" + value);
        return value;
    }

    public void delete(K key) {
        System.out.println("[DBStore] Deleting from DB: key=" + key);
        db.remove(key);
    }
}
