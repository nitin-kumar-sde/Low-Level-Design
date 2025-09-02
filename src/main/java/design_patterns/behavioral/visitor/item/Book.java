package design_patterns.behavioral.visitor.item;

import design_patterns.behavioral.visitor.ItemVisitor;

public class Book implements Item {
    private final String title;
    private final double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}
