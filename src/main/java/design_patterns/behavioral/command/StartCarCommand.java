package design_patterns.behavioral.command;

/**
 * StartCarCommand is a concrete command that starts the car.
 */
public class StartCarCommand implements Command {
    private final Car car;

    public StartCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.start();
    }
}