package practise.elevator.controller;

import practise.elevator.model.*;
import practise.elevator.strategy.ElevatorSelectionStrategy;
import practise.elevator.strategy.FifoMovementStrategy;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {

    private final List<Elevator> elevators;
    private final List<Floor> floors;
    private final ElevatorSelectionStrategy selectionStrategy;

    public ElevatorController(int numElevators, int numFloors,
                              final ElevatorSelectionStrategy strategy) {
        this.elevators = new ArrayList<>();

        for (int i = 0; i < numElevators; i++) {
            elevators.add(new Elevator(i, numFloors, 5,
                    new FifoMovementStrategy()));
        }

        this.floors = new ArrayList<>();

        for (int i = 0; i < numFloors; i++) {
            floors.add(new Floor(i, numFloors));
        }

        this.selectionStrategy = strategy;
    }

    public void selectElevator(int floorNumber, Direction direction) {

        FloorButton floorButton  =  floors.get(floorNumber)
                .getButtons()
                .get(1);
        if(direction == Direction.DOWN) {
            floorButton = floors.get(floorNumber)
                    .getButtons()
                    .getFirst();

        }
        final Request press = floorButton.press();
        final Elevator assigned = selectionStrategy
                .selectElevator((ExternalRequest) press);
        // elevator is selected.
        System.out.println("Assigned elevator " + assigned);
        // add internal request to current destination floor.
        assigned.addNewRequest(new InternalRequest(
                5
        ));

    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public List<Floor> getFloors() {
        return floors;
    }

}
