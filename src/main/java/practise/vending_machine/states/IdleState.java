package practise.vending_machine.states;


import practise.vending_machine.VendingMachineContext;

public class IdleState extends AbstractVendingState {

    @Override
    public String getStateName() {
        return "IDLE";
    }

    @Override
    public void transitionToNextState(VendingMachineContext context) {
        System.out.println("➡️ Transitioning from IDLE to PROCESSING");
        context.setCurrentState(new ProductSelectionState());
    }
}
