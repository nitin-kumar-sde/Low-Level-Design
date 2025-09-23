package practise.elevator;

import practise.elevator.controller.ElevatorController;
import practise.elevator.model.Direction;
import practise.elevator.model.Elevator;
import practise.elevator.strategy.ClosestElevatorStrategy;

public class Main {

    public static void main(String[] args) {

        ClosestElevatorStrategy selectionStrategy = new ClosestElevatorStrategy(); // implement your own
        ElevatorController controller = new ElevatorController(3,
                10, selectionStrategy);

        selectionStrategy.setElevators(controller.getElevators());

        System.out.println("\nRequesting elevator to floor 2 (UP)...");
        controller.selectElevator(2, Direction.UP);

        System.out.println("\nRequesting elevator to floor 7 (DOWN)...");
        controller.selectElevator(7, Direction.DOWN);

        System.out.println("\nRequesting elevator to floor 5 (UP)...");
        controller.selectElevator(5, Direction.UP);

        System.out.println("\nElevator States:");
        for (Elevator elevator : controller.getElevators()) {
            System.out.println("Elevator " + elevator.getId() +
                    " | Current Floor: " + elevator.getCurrentFloor() +
                    " | Direction: " + elevator.getDirection() +
                    " | State: " + elevator.getState());
        }

        System.out.println("\nFinal Elevator States:");
        for (Elevator elevator : controller.getElevators()) {
            System.out.println("Elevator " + elevator.getId() +
                    " | Current Floor: " + elevator.getCurrentFloor() +
                    " | Direction: " + elevator.getDirection() +
                    " | State: " + elevator.getState());
        }
    }
}
