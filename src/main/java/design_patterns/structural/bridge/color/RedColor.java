package design_patterns.structural.bridge.color;

/**
 * RedColor class implementing the Color interface.
 */
public class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}