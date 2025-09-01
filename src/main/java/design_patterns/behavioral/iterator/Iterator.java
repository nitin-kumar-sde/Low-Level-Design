package design_patterns.behavioral.iterator;

/**
 * Iterator interface defining methods for traversing a collection.
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
