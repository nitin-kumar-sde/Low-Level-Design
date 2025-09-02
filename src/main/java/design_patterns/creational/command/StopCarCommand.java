package design_patterns.creational.command;

/**
 * StopCarCommand is a concrete command that stops the car.
 */
public class StopCarCommand implements Command {
    private final Car car;

    public StopCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stop();
    }
}