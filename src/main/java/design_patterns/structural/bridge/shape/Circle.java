package design_patterns.structural.bridge.shape;

import design_patterns.structural.bridge.color.Color;

/**
 * Circle class extending the Shape class.
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle with ");
        color.applyColor();
    }
}