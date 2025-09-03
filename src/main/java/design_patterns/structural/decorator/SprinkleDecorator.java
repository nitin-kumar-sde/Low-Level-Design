package design_patterns.structural.decorator;

/**
 * Concrete decorator that adds sprinkles to the cake.
 */
public class SprinkleDecorator extends CakeDecorator {

    private static final double SPRINKLE_DECORATOR = 30.0;

    public SprinkleDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return decoratedCake.getDescription() + ", Sprinkles";
    }

    @Override
    public double getCost() {
        return decoratedCake.getCost() + SPRINKLE_DECORATOR;
    }
}