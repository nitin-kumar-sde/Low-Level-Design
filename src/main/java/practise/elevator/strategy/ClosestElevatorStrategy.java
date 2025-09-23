package practise.elevator.strategy;

import practise.elevator.model.Direction;
import practise.elevator.model.Elevator;
import practise.elevator.model.ExternalRequest;

import java.util.ArrayList;
import java.util.List;

public class ClosestElevatorStrategy implements ElevatorSelectionStrategy {

    private  List<Elevator> elevators;

    public ClosestElevatorStrategy() {
        this.elevators = new ArrayList<>();
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    @Override
    public Elevator selectElevator(ExternalRequest request) {
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        int requestedFloor = request.getSourceFloor();
        Direction requestedDirection = request.getDirection();

        for (Elevator elevator : elevators) {
            // Skip elevators that are full (optional if capacity implemented)
            // if (elevator.isFull()) continue;

            int distance = Math.abs(elevator.getCurrentFloor() - requestedFloor);

            // Prefer elevators moving in the same direction or idle
            if (elevator.getDirection() == Direction.IDLE ||
                    elevator.getDirection() == requestedDirection) {

                if (distance < minDistance) {
                    minDistance = distance;
                    bestElevator = elevator;
                }
            }
        }

        // If no suitable elevator found, fallback to first idle elevator
        if (bestElevator == null) {
            for (Elevator elevator : elevators) {
                if (elevator.getDirection() == Direction.IDLE) {
                    bestElevator = elevator;
                    break;
                }
            }
        }


        return bestElevator;
    }
}
