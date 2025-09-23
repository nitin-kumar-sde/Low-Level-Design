package practise.elevator.model;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private final int floorNumber;
    private final List<FloorButton> buttons;

    public Floor(int floorNumber, int totalFloors) {
        this.floorNumber = floorNumber;
        this.buttons = new ArrayList<>();

        if (floorNumber > 0) {
            buttons.add(new FloorButton(floorNumber, Direction.DOWN));
        }
        if (floorNumber < totalFloors - 1) {
            buttons.add(new FloorButton(floorNumber, Direction.UP));
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<FloorButton> getButtons() {
        return buttons;
    }
}

