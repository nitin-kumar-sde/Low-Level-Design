package design_patterns.creational.command;

/**
 * AccelerateCarCommand is a concrete command that accelerates the car.
 */
public class AccelerateCarCommand implements Command {
    private final Car car;

    public AccelerateCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.accelerate();
    }
}
