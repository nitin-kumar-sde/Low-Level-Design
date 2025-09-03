package design_patterns.structural.bridge.color;

/**
 * BlueColor class implementing the Color interface.
 */

public class BlueColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying Blue Color");
    }
}
