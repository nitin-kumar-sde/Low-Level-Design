package practise.elevator.strategy;


import practise.elevator.model.Elevator;
import practise.elevator.model.InternalRequest;
import practise.elevator.model.Request;

import java.util.Queue;

public class FifoMovementStrategy implements ElevatorMovementStrategy {

    @Override
    public int selectNextFloor(Elevator elevator) {
        // serves request as per destinations of internal requests(actual floor selection
        // after entering the lift
        Queue<InternalRequest> queue = elevator.getRequestQueue();
        return queue.isEmpty() ? -1 : ((InternalRequest)queue.peek())
                .getDestinationFloor();
    }
}

