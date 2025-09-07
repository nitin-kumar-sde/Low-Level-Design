package practise.atm.state;


import practise.atm.model.ATMContext;

public abstract class State {

    // should be ENUM ideally
    public abstract String getStateName();

    public abstract void performAction(ATMContext context);

}
