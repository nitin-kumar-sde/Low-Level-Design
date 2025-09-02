package design_patterns.behavioral.visitor;

import design_patterns.behavioral.visitor.item.Book;
import design_patterns.behavioral.visitor.item.Electronics;

public class DiscountVisitor implements ItemVisitor {

    @Override
    public void visit(Book book) {
        double discountedPrice = book.getPrice() * 0.90; // 10% off
        System.out.println("Book: " + book.getTitle() +
                " | Discounted Price: $" + discountedPrice);
    }

    @Override
    public void visit(Electronics electronics) {
        double discountedPrice = electronics.getPrice() * 0.95; // 5% off
        System.out.println("Electronics: " + electronics.getName() +
                " | Discounted Price: $" + discountedPrice);
    }
}
