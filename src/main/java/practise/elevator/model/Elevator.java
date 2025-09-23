package practise.elevator.model;

import practise.elevator.strategy.ElevatorMovementStrategy;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {

    private final int id;
    private int currentFloor;
    private final int capacity;
    private Direction direction;
    private ElevatorState state;
    private final Queue<InternalRequest> requestQueue;
    private final ElevatorMovementStrategy movementStrategy;

    public Elevator(int id, int capacity, int initialFloor,
                    final ElevatorMovementStrategy strategy) {
        this.id = id;
        this.capacity = capacity;
        this.currentFloor = initialFloor;
        this.direction = Direction.IDLE;
        this.state = ElevatorState.IDLE;
        this.requestQueue = new LinkedList<>();
        this.movementStrategy = strategy;
    }

    public void addNewRequest(InternalRequest request) {

        if (!requestQueue.contains(request)) {
            requestQueue.add(request);
        }
        // move if not already moving
        if(state == ElevatorState.IDLE) {
            move();
        }

    }

    public void move() {
        // find next
        int destinationFloor = movementStrategy.selectNextFloor(this);

        if(destinationFloor == currentFloor) {
            state = ElevatorState.IDLE;
            return;
        }
        moveToNextStop(destinationFloor);

    }

    public void moveToNextStop(int nextStop) {

        // move if idle already
        if(state != ElevatorState.MOVING) {
            state = ElevatorState.MOVING;
        }

        while (currentFloor != nextStop) {
            // Update floor based on direction
            if (direction == Direction.UP) {
                currentFloor++;
            } else {
                currentFloor--;
            }

            }
    }

    // Handle the elevator's arrival at a destination floor
    private void completeArrival() {
        state = ElevatorState.STOPPED;

        requestQueue.removeIf((request ->
                request.getDestinationFloor() == currentFloor));
        // open door

        if (requestQueue.isEmpty()) {
            direction = Direction.IDLE;
            state = ElevatorState.IDLE;
        } else {
            state = ElevatorState.MOVING;
            move();
        }
    }


    public void stop() {
        state = ElevatorState.STOPPED;
        direction = Direction.IDLE;
        System.out.println("Elevator " + id + " stopped at floor " + currentFloor);
    }

    // ---- Getters ----
    public int getId() {
        return id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public ElevatorState getState() {
        return state;
    }

    public Queue<InternalRequest> getRequestQueue() {
        return requestQueue;
    }

}
