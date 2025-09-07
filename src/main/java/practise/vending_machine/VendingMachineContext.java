package practise.vending_machine;

import practise.vending_machine.inventory.Inventory;
import practise.vending_machine.states.AbstractVendingState;
import practise.vending_machine.states.IdleState;

/**
 * Context class that maintains state and handles transitions in. the vending machine
  */
public class VendingMachineContext {

    private AbstractVendingState currentState;

    private final Inventory inventory;

    public VendingMachineContext() {
        inventory = new Inventory(10);
        currentState = new IdleState();
    }

    public AbstractVendingState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AbstractVendingState currentState) {
        this.currentState = currentState;
        transitionToNextState();
    }

    public Inventory getInventory() {
        return inventory;
    }

    // Advances the vending machine to the next state
    public void transitionToNextState() {
        currentState.transitionToNextState(this);
    }

}