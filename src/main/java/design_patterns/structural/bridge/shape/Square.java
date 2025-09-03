package design_patterns.structural.bridge.shape;

import design_patterns.structural.bridge.color.Color;

/**
 * Square class extending Shape and using the Color interface.
 */
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Square with ");
        color.applyColor();
    }
}

