package design_patterns.structural.decorator;

/**
 * Concrete implementation of a basic cake.
 */
public class BaseCake extends Cake {
    @Override
    public String getDescription() {
        return "Plain Sponge Cake";
    }

    @Override
    public double getCost() {
        return 200.0; // Base cost in ₹
    }
}
