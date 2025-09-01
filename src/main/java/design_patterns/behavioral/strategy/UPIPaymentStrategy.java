package design_patterns.behavioral.strategy;

/**
 * Concrete strategy for UPI payment.
 */
public class UPIPaymentStrategy implements PaymentStrategy {

    private final String upiId;

    public UPIPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }
}
