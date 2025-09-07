package practise.atm.state;

import practise.atm.model.ATMContext;

public class IDLEState extends State {

    @Override
    public String getStateName() {
        return "IDLE";
    }

    @Override
    public void performAction(ATMContext context) {
        System.out.println("Welcome !!!!");
        // once user enters card
        // in real world interacts with hardware, once card is inserted, state is move
        State newState = new HasCardState();
        context.setCurrentState(newState);
        context.performAction();
    }

}
