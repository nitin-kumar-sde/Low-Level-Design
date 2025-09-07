package practise.atm.state;

import practise.atm.model.ATMContext;

public class SelectionState extends State{


    @Override
    public String getStateName() {
        return "SELECTION";
    }

    @Override
    public void performAction(ATMContext context) {
        System.out.println("Please select a action");

        // Ideally in Prod code it should move to Transition
        final State newState = new CashDispenseState(400);

        context.setCurrentState(newState);
        context.performAction();
    }
}
