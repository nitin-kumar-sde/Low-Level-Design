package design_patterns.behavioral.visitor;

import design_patterns.behavioral.visitor.item.Book;
import design_patterns.behavioral.visitor.item.Electronics;

/**
 * Visitor interface for items.
 * Addition of new operations can be done by implementing this interface.
 * This adheres to the Open/Closed Principle by allowing new functionality
 * without modifying existing item classes.
 */
public interface ItemVisitor {
    void visit(Book book);
    void visit(Electronics electronics);
}
