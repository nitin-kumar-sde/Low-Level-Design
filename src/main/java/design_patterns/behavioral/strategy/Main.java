package design_patterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        // Strategy will be injected using bean configuration in real world application.

        // one word change will change the complete payment method
        PaymentProcessor processor = new PaymentProcessor(
                new UPIPaymentStrategy("nitin@upi"));
        processor.processPayment(3000);

    }
}
