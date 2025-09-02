package design_patterns.behavioral.visitor;

import design_patterns.behavioral.visitor.item.Book;
import design_patterns.behavioral.visitor.item.Electronics;
import design_patterns.behavioral.visitor.item.Item;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> items = List.of(
                new Book("Design Patterns", 500),
                new Electronics("Smartphone", 1500)
        );

        ItemVisitor discountVisitor = new DiscountVisitor();

        for (Item item : items) {
            item.accept(discountVisitor);
        }
    }
}
