package design_patterns.creational.command;

/**
 * CarRemoteControl is the invoker that triggers commands.
 */

public class CarRemoteControl implements RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }


    @Override
    public void pressButton() {
        command.execute();
    }
}
