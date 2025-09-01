package solid.printer;

public class StringAreaPrinter implements AreaPrinter {

    @Override
    public void printArea(double area) {
        System.out.println("Area: " + area);
    }
}