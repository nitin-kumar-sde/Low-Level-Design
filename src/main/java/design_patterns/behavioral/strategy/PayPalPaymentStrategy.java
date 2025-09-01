package design_patterns.behavioral.strategy;

/**
 * Concrete strategy for PayPal payment.
 */
public class PayPalPaymentStrategy implements PaymentStrategy {

    private final String email;

    public PayPalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal account: " + email);
    }
}
