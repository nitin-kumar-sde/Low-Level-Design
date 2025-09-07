package practise.vending_machine.payment;

/**
 * Interface for Payment method.
 */
public interface PaymentStrategy {

    void pay(double amount);
}
