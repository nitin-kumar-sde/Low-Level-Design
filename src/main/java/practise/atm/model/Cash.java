package practise.atm.model;

public enum Cash {

    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    private final int amount;

    Cash(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
