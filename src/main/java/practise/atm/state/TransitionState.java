package practise.atm.state;

import practise.atm.model.ATMContext;

// This state can be extended if we want to incorporate Check balance
// into Transaction.

public class TransitionState extends State {

    @Override
    public String getStateName() {
        return "TRANSITION";
    }

    @Override
    public void performAction(ATMContext context) {
        // checks balance if user has sufficient balance
        final State newState = new CashDispenseState(1000);
        context.setCurrentState(newState);
        context.performAction();
    }
}
