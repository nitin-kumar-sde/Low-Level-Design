package practise.atm;

import practise.atm.model.ATMContext;

public class Main {

    public static void main(String[] args) {
        final ATMContext atmContext = new ATMContext();
        final ATM atm = new ATM(atmContext);
        atm.start();
    }
}
