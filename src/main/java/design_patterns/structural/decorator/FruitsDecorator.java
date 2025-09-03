package design_patterns.structural.decorator;

/**
 * Concrete Decorator that adds fruits to the cake.
 */

public class FruitsDecorator extends CakeDecorator {

    private static final double FRUITS_COST = 75.0;

    public FruitsDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return decoratedCake.getDescription() + ", Fresh Fruits";
    }

    @Override
    public double getCost() {
        return decoratedCake.getCost() + FRUITS_COST;
    }
}

