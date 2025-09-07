package practise.atm.handlers;


public abstract class CashDispenseHandler {
    protected CashDispenseHandler nextHandler;

    public void setNextHandler(CashDispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void dispense(double amount);
}

