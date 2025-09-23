package practise.elevator.strategy;

import practise.elevator.model.Elevator;

public interface ElevatorMovementStrategy {

    int selectNextFloor(Elevator elevator);
}
