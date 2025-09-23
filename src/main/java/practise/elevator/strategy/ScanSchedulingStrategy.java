package practise.elevator.strategy;

import practise.elevator.model.*;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ScanSchedulingStrategy implements ElevatorMovementStrategy {

    @Override
    public int selectNextFloor(final Elevator elevator) {
        Direction elevatorDirection = elevator.getDirection();
        int currentFloor = elevator.getCurrentFloor();

        Queue<InternalRequest> requests = elevator.getRequestQueue();

        if (requests.isEmpty()) {
            // stay at current floor.
            return currentFloor;
        }

        final PriorityQueue<InternalRequest> upQueue =

                new PriorityQueue<>(Comparator.comparingInt(InternalRequest::getDestinationFloor));

        final PriorityQueue<InternalRequest> downQueue =
                new PriorityQueue<>((a, b) -> b.getDestinationFloor() - a.getDestinationFloor());

        for (InternalRequest req : requests) {

            if (req.getDestinationFloor() > currentFloor) {
                upQueue.add(req);

            } else if (req.getDestinationFloor() < currentFloor) {
                downQueue.add(req);
            } else {
                return currentFloor;
            }
        }

        // Handle IDLE case → pick nearest request, set direction
        if (elevatorDirection == Direction.IDLE) {
            final Integer nearestUp = upQueue.isEmpty() ? null :
                    upQueue.peek().getDestinationFloor();

            final Integer nearestDown = downQueue.isEmpty() ? null :
                    downQueue.peek().getDestinationFloor();

            if (nearestUp == null && nearestDown != null) {
                elevator.setDirection(Direction.DOWN);
                return Objects.requireNonNull(downQueue.poll())
                        .getDestinationFloor();

            } else if (nearestDown == null && nearestUp != null) {
                elevator.setDirection(Direction.UP);
                return Objects.requireNonNull(upQueue.poll())
                        .getDestinationFloor();

            } else if (nearestUp != null && nearestDown != null) {
               // choose the closest
                if (Math.abs(nearestUp - currentFloor) < Math.abs(nearestDown - currentFloor)) {
                    elevator.setDirection(Direction.UP);
                    return Objects.requireNonNull(upQueue.poll())
                            .getDestinationFloor();
                } else {
                    elevator.setDirection(Direction.DOWN);
                    return Objects.requireNonNull(downQueue.poll())
                            .getDestinationFloor();
                }
            }
        }

        // Handle UP direction
        if (elevatorDirection == Direction.UP) {

            if(upQueue.isEmpty()) {
                // if empty return current Floor.

                // else
                elevator.setDirection(Direction.DOWN);
                return Objects.requireNonNull(downQueue.poll())
                        .getDestinationFloor();

            }

            return Objects.requireNonNull(upQueue.poll())
                    .getDestinationFloor();
        }

        // Handle DOWN direction
        if (elevatorDirection == Direction.DOWN) {

            if(downQueue.isEmpty()) {
                // if empty return current Floor.
                // else
                elevator.setDirection(Direction.UP);

                return Objects.requireNonNull(upQueue.poll())
                        .getDestinationFloor();

            }
        }

        return currentFloor;
    }
}

