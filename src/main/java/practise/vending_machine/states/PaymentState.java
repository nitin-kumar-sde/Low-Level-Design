package practise.vending_machine.states;

import practise.vending_machine.VendingMachineContext;
import practise.vending_machine.payment.PaymentStrategy;

public class PaymentState extends AbstractVendingState {

    private final PaymentStrategy paymentStrategy;

    private final double amount;

    public PaymentState(PaymentStrategy paymentStrategy, double amount) {
        this.paymentStrategy = paymentStrategy;
        this.amount = amount;
    }

    @Override
    public String getStateName() {
        return "PAYMENT";
    }

    @Override
    public void transitionToNextState(VendingMachineContext context) {
        paymentStrategy.pay(amount);
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }


}
