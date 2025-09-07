package practise.atm.state;

import practise.atm.model.ATMContext;
import practise.atm.model.Card;

import java.util.Scanner;

public class HasCardState extends State {
    private Card card;

    @Override
    public String getStateName() {
        return "HAS_CARD";
    }

    @Override
    public void performAction(ATMContext context) {
        System.out.println("Please enter your PIN");
        Scanner scanner = new Scanner(System.in);
        int pin = scanner.nextInt();
        State newState = new SelectionState();
        context.setCurrentState(newState);
        context.performAction();
    }
}
