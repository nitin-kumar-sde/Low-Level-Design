package design_patterns.structural.decorator;

/**
 * Concrete decorator that adds a chocolate layer to the cake.
 */
public class ChocolateDecorator extends CakeDecorator {

    private static final double CHOCOLATE_COST = 50.0;

    public ChocolateDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return decoratedCake.getDescription() + ", Chocolate Layer";
    }

    @Override
    public double getCost() {
        return decoratedCake.getCost() + CHOCOLATE_COST;
    }
}