package practise.vending_machine.states;

import practise.vending_machine.VendingMachineContext;

/**
 * Base class for all vending machine states.
 * Provides default behavior for common functions.
 */
public abstract class AbstractVendingState {

    public abstract String getStateName();

    public abstract void transitionToNextState(VendingMachineContext context);
}

