package design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory class to manage and provide shared Shape instances.
 * It uses a cache to store and reuse shapes based on their type and intrinsic state.
 */
public class ShapeFactory {
    private static final Map<String, Shape> shapeCache = new HashMap<>();

    public static Shape getShape(String type, int dimension) {
        String key = type + "_" + dimension; // unique combination

        return shapeCache.computeIfAbsent(key, k -> {
            switch (type.toLowerCase()) {
                case "circle" -> {
                    System.out.println("Creating new Circle with radius " + dimension);
                    return new Circle(dimension);
                }
                case "square" -> {
                    System.out.println("Creating new Square with side " + dimension);
                    return new Square(dimension);
                }
                default -> throw new IllegalArgumentException("Unknown shape: " + type);
            }
        });
    }
}
