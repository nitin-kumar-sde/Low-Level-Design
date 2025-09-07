package practise.atm.handlers;


public class FiveHundredHandler extends CashDispenseHandler {
    @Override
    public void dispense(double amount) {

        if (amount >= 500) {
            int numNotes = (int) (amount / 500);
            int remainder = (int) (amount % 500);
            System.out.println("Dispensing " + numNotes + " x 500 notes");
            if (remainder != 0 && nextHandler != null) {
                nextHandler.dispense(remainder);
            }
        } else if (nextHandler != null) {
            nextHandler.dispense(amount);
        }
    }
}
