package practise.atm.model;

import practise.atm.state.State;

// In Real application this class hold all the relevant context like ref to
// dispenser, downstream services.
public class ATMContext {

    private State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        System.out.println("Currently at " + currentState.getStateName());
    }

    public void performAction() {
        this.currentState.performAction(this);
    }
    public State getCurrentState() {
        return currentState;
    }


}
