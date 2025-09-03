package design_patterns.structural.decorator;

/**
 * Abstract decorator class for Cake, extending the Cake class
 * and holding a reference to a Cake object to be decorated.
 */
public abstract class CakeDecorator extends Cake {
    protected Cake decoratedCake;

    public CakeDecorator(Cake cake) {
        this.decoratedCake = cake;
    }

    @Override
    public String getDescription() {
        return decoratedCake.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCake.getCost();
    }
}

