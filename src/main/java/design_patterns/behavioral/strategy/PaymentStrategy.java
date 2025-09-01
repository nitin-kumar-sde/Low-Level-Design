package design_patterns.behavioral.strategy;

/**
 * Strategy interface for payment methods.
 */
public interface PaymentStrategy {
    void pay(double amount);
}
