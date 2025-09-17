package practise.cache.node;

/**
 * Doubly Linked List with dummy head & tail for simplifying operations.
 * Used in LRU cache eviction strategy.
 *
 * @param <K> the type of key stored in the list nodes
 */
public class DoublyLinkedList<K> {
    private final Node<K> head;
    private final Node<K> tail;

    public DoublyLinkedList() {
        head = new Node<>(null);
        tail = new Node<>(null);
        head.setNext(tail);
        tail.setPrev(head);
    }

    /**
     * Adds a node right after the head (marks as most recently used).
     */
    public void addToFront(Node<K> node) {
        node.setNext(head.getNext());
        node.setPrev(head);
        head.getNext().setPrev(node);
        head.setNext(node);
    }

    /**
     * Removes the given node from the list safely.
     */
    public void removeNode(Node<K> node) {
        if (node == null || node == head || node == tail) {
            return; // don't remove dummy nodes or null
        }
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        node.setPrev(null);
        node.setNext(null);
    }

    /**
     * Removes the last real node (least recently used) from the list.
     * @return the removed node or null if list is empty.
     */
    public Node<K> removeLast() {
        if (tail.getPrev() == head) {
            return null; // empty list
        }
        Node<K> lruNode = tail.getPrev();
        removeNode(lruNode);
        return lruNode;
    }

    /**
     * Check if the list is empty (no real nodes).
     */
    public boolean isEmpty() {
        return head.getNext() == tail;
    }
}
