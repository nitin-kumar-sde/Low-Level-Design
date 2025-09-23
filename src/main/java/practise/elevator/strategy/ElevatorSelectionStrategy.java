package practise.elevator.strategy;

import practise.elevator.model.Elevator;
import practise.elevator.model.ExternalRequest;

public interface ElevatorSelectionStrategy {

    Elevator selectElevator(ExternalRequest request);
}
