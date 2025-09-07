package practise.atm.state;

import practise.atm.model.ATMContext;

public class CashDispenseState extends State {

    private double amount;
    private final CashDispenserChain cashDispenserChain;

    public CashDispenseState(double amount) {
        // this should inject in production codebases
        this.cashDispenserChain = new CashDispenserChain();
        this.amount = amount;
    }

    @Override
    public String getStateName() {
        return "CASH_DISPENSE";
    }

    @Override
    public void performAction(ATMContext context) {
        cashDispenserChain.dispense(amount);
    }


    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CashDispenserChain getCashDispenserChain() {
        return cashDispenserChain;
    }
}
