package practise.elevator.model;

public class FloorButton extends Button {

    private final Direction direction;

    public FloorButton(int floor, Direction direction) {
        super(floor);
        this.direction = direction;
    }

    @Override
    public Request press() {
        return new ExternalRequest(getFloor(), direction);
    }
}
