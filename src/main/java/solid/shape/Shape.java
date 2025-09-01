package solid.shape;

/**
 * This interface adheres to the Interface Segregation Principle.
 * It ensures that classes implementing this interface only need to provide the
 * method relevant to their functionality.
 */
public interface Shape {

    double calculateArea();

}