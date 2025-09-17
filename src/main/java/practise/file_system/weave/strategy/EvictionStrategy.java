package com.weave.strategy;


/**
 * Defines a contract for cache eviction strategies.
 */
public interface EvictionStrategy<K> {
    /**
     * Called whenever a key is accessed (on Get/Set).
     */
    void keyAccessed(K key);

    /**
     * Called when cache is full to choose which key to evict.
     */
    K evictKey();

    /**
     * Called when a key is explicitly removed from cache.
     */
    void removeKey(K key);
}

