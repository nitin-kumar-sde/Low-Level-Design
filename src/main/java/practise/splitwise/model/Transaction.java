package practise.splitwise.model;

public class Transaction {

    private final User from;
    private final User to;
    private double amount;

    public Transaction(final User from, final User to,
                       final double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public User getFrom() { return from; }
    public User getTo() { return to; }
    public double getAmount() { return amount; }
}

