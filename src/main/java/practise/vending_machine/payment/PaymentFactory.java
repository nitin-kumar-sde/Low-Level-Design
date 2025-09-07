package practise.vending_machine.payment;

public class PaymentFactory {

    public static PaymentStrategy getPaymentStrategy(String paymentType) {

        if("UPI".equals(paymentType))
            return new UPIPaymentStrategy();
        else if("CREDIT_CARD".equals(paymentType))
            return new CreditCardPaymentStrategy();
        else throw new RuntimeException("Invalid selection ...");
    }
}
