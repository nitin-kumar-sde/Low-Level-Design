package design_patterns.structural.bridge;

import design_patterns.structural.bridge.color.BlueColor;
import design_patterns.structural.bridge.color.RedColor;
import design_patterns.structural.bridge.shape.Circle;
import design_patterns.structural.bridge.shape.Shape;
import design_patterns.structural.bridge.shape.Square;

public class Main {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redCircle.draw();
        blueSquare.draw();
    }
}
