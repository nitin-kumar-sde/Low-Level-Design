package practise.vending_machine.states;

import practise.vending_machine.VendingMachineContext;

public class DispatchState extends AbstractVendingState {

    @Override
    public String getStateName() {
        return "DISPATCH";
    }

    @Override
    public void transitionToNextState(VendingMachineContext context) {
        System.out.println("➡️ Transitioning from DISPATCH to IDLE");
        context.setCurrentState(new IdleState());
    }
}
