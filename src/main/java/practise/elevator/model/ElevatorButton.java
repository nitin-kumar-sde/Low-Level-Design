package practise.elevator.model;

public class ElevatorButton extends Button {

    public ElevatorButton(final int floor) {
        super(floor);
    }

    @Override
    public Request press() {
        return new InternalRequest(getFloor());
    }
}

