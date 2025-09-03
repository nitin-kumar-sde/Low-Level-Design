package design_patterns.structural.bridge.shape;

import design_patterns.structural.bridge.color.Color;

/**
 * Abstract Shape class that uses the Color interface.
 */
public abstract class Shape {
    protected Color color;  // Bridge to implementation

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}

