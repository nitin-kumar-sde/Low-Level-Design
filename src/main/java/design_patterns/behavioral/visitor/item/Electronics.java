package design_patterns.behavioral.visitor.item;

import design_patterns.behavioral.visitor.ItemVisitor;

public class Electronics implements Item {
    private final String name;
    private final double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}
