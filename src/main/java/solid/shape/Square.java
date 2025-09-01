package solid.shape;

/**
 * Square can't be substituted for Rectangle.
 * This violates the Liskov Substitution Principle (LSP).
 * A subclass should be substitutable for its superclass.
 */
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }
}