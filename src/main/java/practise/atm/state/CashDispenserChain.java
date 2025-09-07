package practise.atm.state;


import practise.atm.handlers.CashDispenseHandler;
import practise.atm.handlers.FiveHundredHandler;
import practise.atm.handlers.OneHundredHandler;

public class CashDispenserChain {

    private final CashDispenseHandler chain;

    public CashDispenserChain() {

        CashDispenseHandler fiveHundred = new FiveHundredHandler();
        CashDispenseHandler oneHundred = new OneHundredHandler();
        fiveHundred.setNextHandler(oneHundred);

        this.chain = fiveHundred;
    }

    public void dispense(double amount) {
        if (amount % 100 != 0) {
            // ideally throw exception
            System.out.println("⚠️ Amount should be in multiples of 100");
            return;
        }
        chain.dispense(amount);
    }
}
