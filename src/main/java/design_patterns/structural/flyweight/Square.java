package design_patterns.structural.flyweight;

/**
 * Square class implementing the Shape interface.
 * This class represents a square with a specific side length (intrinsic state).
 */
public class Square implements Shape {
    private final int side; // intrinsic state

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw(String color, int x, int y) {
        System.out.println("Drawing " + color + " square with side " + side +
                " at (" + x + ", " + y + ")");
    }
}
