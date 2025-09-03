package design_patterns.structural.flyweight;

/**
 * Interface for shapes that can be drawn with specific attributes.
 */
public interface Shape {
    void draw(String color, int x, int y);
}
