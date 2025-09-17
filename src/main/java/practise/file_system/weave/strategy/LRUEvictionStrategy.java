package com.weave.strategy;

import com.weave.node.DoublyLinkedList;
import com.weave.node.Node;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Evicts the least recently used key using HashMap + Doubly Linked List.
 */
@Component
public class LRUEvictionStrategy<K> implements EvictionStrategy<K> {

    private final ConcurrentHashMap<K, Node<K>> nodeMap;
    private final DoublyLinkedList<K> dll;
    private final ReentrantLock lock = new ReentrantLock();

    public LRUEvictionStrategy() {
        this.nodeMap = new ConcurrentHashMap<>();
        this.dll = new DoublyLinkedList<>();
    }

    @Override
    public void keyAccessed(K key) {
        Node<K> node = nodeMap.get(key);
        lock.lock();
        try {
            if (node != null) {
                dll.removeNode(node);
            } else {
                node = new Node<>(key);
                nodeMap.put(key, node);
            }
            dll.addToFront(node);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public K evictKey() {
        lock.lock();
        try {
            Node<K> lruNode = dll.removeLast();
            if (lruNode != null) {
                nodeMap.remove(lruNode.getKey());
                return lruNode.getKey();
            }
            return null;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void removeKey(K key) {
        Node<K> node = nodeMap.get(key);
        if (node != null) {
            lock.lock();
            try {
                dll.removeNode(node);
                nodeMap.remove(key);
            } finally {
                lock.unlock();
            }
        }
        // else part - handling depends on business use-case
    }
}
