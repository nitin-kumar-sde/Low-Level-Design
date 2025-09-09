package practise.car_rental.strategy;


public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("💳 Processing credit card payment of $" + amount +
                " using card " + cardNumber);
        return true; // dummy success
    }
}
