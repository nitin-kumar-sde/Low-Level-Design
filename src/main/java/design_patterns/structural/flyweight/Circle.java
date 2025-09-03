package design_patterns.structural.flyweight;

/**
 * Circle class implementing the Shape interface.
 * This class represents a circle with a specific radius (intrinsic state).
 */
public class Circle implements Shape {
    private final int radius; // intrinsic state

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(String color, int x, int y) {
        System.out.println("Drawing " + color + " circle with radius " + radius +
                " at (" + x + ", " + y + ")");
    }
}

