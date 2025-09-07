package practise.atm.handlers;


public class OneHundredHandler extends CashDispenseHandler {

    @Override
    public void dispense(double amount) {

        if (amount >= 100) {
            int numNotes = (int) (amount / 100);
            int remainder = (int) (amount % 100);
            System.out.println("Dispensing " + numNotes + " x 100 notes");
            if (remainder != 0 && nextHandler != null) {
                nextHandler.dispense(remainder);
            }
        } else if (nextHandler != null) {
            nextHandler.dispense(amount);
        }
    }
}

