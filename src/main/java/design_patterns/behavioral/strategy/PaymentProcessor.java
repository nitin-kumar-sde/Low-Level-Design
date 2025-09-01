package design_patterns.behavioral.strategy;

/**
 * Payment Processor class that uses a PaymentStrategy to process payments.
 */
public class PaymentProcessor {

    // different payment strategies can be injected dynamically
    private final PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
