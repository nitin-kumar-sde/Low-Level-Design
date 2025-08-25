package SOLID;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Now we can new shape and implement the calculateArea method without changing the AreaCalculator class.
 * This adheres to the Open/Closed Principle.
 * Modules are Open for extension but closed for modification.
 */
@Log4j2
public class AreaCalculator {

    /**
     * Dependency Inversion Principle
     * High-level modules should not depend on low-level modules. Both should depend on abstractions.
     * Abstractions should not depend on details. Details should depend on abstractions.
     * Here, AreaCalculator (high-level module) depends on AreaPrinter (abstraction)
     * rather than a concrete implementation of AreaPrinter (low-level module).
     */


    private final AreaPrinter areaPrinter;

    public AreaCalculator(AreaPrinter areaPrinter) {
        this.areaPrinter = areaPrinter;
    }

    public double calculateArea(List<Shape> shapes){
        double totalArea = 0.0;
        for(Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        log.info("Calculated total area: {}" ,totalArea);
        return totalArea;
    }

    public void printArea(double area) {
        areaPrinter.printArea(area);
    }
}
