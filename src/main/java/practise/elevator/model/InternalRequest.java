package practise.elevator.model;

public class InternalRequest extends Request {

    private final int destinationFloor;

    public InternalRequest(final int destinationFloor) {
        super(RequestType.INTERNAL);
        this.destinationFloor = destinationFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }
}

