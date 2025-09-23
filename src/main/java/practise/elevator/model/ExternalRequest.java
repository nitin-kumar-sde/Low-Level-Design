package practise.elevator.model;

public class ExternalRequest extends Request {
    private final int sourceFloor;
    private final Direction direction;

    public ExternalRequest(int sourceFloor, Direction direction) {
        super(RequestType.EXTERNAL);
        this.sourceFloor = sourceFloor;
        this.direction = direction;
    }

    public int getSourceFloor() {
        return sourceFloor;
    }

    public Direction getDirection() {
        return direction;
    }
}
