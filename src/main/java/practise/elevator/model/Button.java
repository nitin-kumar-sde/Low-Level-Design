package practise.elevator.model;

public abstract class Button {

    private final int floor;

    protected Button(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public abstract Request press();
}
