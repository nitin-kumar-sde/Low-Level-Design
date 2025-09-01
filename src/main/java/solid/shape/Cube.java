package solid.shape;

/**
 * If we define volume in Shape, Even 2D shapes like Circle have to implement volume.
 * So we create another interface ThreeDShape for 3D shapes.
 * This is called Interface Segregation Principle.
 */
public class Cube implements Shape, ThreeDShape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}