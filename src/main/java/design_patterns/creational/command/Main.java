package design_patterns.creational.command;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        final Command startCommand = new StartCarCommand(car);
        final Command stopCommand = new StopCarCommand(car);
        final Command accelerateCommand = new AccelerateCarCommand(car);

        final CarRemoteControl remote = new CarRemoteControl();

        // Start the car
        remote.setCommand(startCommand);
        remote.pressButton();

        // Stop the car
        remote.setCommand(stopCommand);
        remote.pressButton();

        // Accelerate the car
        remote.setCommand(accelerateCommand);
        remote.pressButton();
    }
}
