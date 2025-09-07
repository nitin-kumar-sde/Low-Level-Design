package practise.atm.state;

import practise.atm.model.ATMContext;
import practise.atm.model.Card;

public class PinValidationState extends State {

    private Card card;
    private int pin;

    public PinValidationState(Card card, int pin) {
        this.card = card;
        this.pin = pin;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String getStateName() {
        return "PIN_VALIDATION";
    }

    @Override
    public void performAction(ATMContext context) {
        // performs validation using validation
        // move to BlockedState after 3 retries

        State newState = new TransitionState();
        context.setCurrentState(newState);
        context.performAction();
        context.performAction();
    }
}
