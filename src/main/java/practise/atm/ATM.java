package practise.atm;

import practise.atm.model.ATMContext;
import practise.atm.state.IDLEState;

// This is domain layer, which receives requests from controller and
// kicks ATM flows.

// This can be made singleton
public class ATM {

    private final ATMContext atmContext;


    public ATMContext getAtmContext() {
        return atmContext;
    }
    // this will hold additional reference like adding cash to ATM


    public ATM(ATMContext atmContext) {
        this.atmContext = atmContext;
    }

    public void start() {

        atmContext.setCurrentState(new IDLEState());
        atmContext.performAction();
    }
}
