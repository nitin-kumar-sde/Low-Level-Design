package solid.printer;
/**
 * This interface adheres to the Dependency Inversion Principle.
 * It allows high-level modules to depend on abstractions rather than concrete implementations.
 */
public interface AreaPrinter {
    void printArea(double area);
}