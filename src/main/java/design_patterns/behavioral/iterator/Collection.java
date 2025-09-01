package design_patterns.behavioral.iterator;

/**
 * Collection interface defining a method to create an iterator.
 */
public interface Collection<T> {
    Iterator<T> iterator();
}
