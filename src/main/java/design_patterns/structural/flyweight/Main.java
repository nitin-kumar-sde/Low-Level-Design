package design_patterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        // Draw circles with different radius but reused instances
        for (int i = 0; i < 5; i++) {
            Shape circle = ShapeFactory.getShape("circle", i % 2 == 0 ? 10 : 20);
            circle.draw(i % 2 == 0 ? "Red" : "Blue", i * 5, i * 5);
        }

        System.out.println("---");

        // Draw squares with different side lengths
        for (int i = 0; i < 5; i++) {
            Shape square = ShapeFactory.getShape("square", i % 3 == 0 ? 5 : 15);
            square.draw(i % 3 == 0 ? "Green" : "Yellow", i * 3, i * 2);
        }
    }
}
