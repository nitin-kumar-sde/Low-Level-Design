package practise.atm.model;

public abstract class Card {

    private int pinNumber;

    private final BankAccount account;

    public Card(BankAccount account) {
        this.account = account;
    }

    public Card(int pinNumber, BankAccount account) {
        this.pinNumber = pinNumber;
        this.account = account;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public boolean validatePin(final int pinNumber) {
        return pinNumber == this.pinNumber;
    }
}
