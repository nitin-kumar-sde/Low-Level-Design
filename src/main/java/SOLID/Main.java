package SOLID;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square(4);
        Shape circle = new Circle(5);

        AreaCalculator areaCalculator = new AreaCalculator(new StringAreaPrinter());
        List<Shape> shapes = List.of(square, circle);
        double totalArea = areaCalculator.calculateArea(shapes);
        System.out.println("Total Area: " + totalArea);
    }
}
