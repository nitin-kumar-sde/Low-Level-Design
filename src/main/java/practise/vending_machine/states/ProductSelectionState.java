package practise.vending_machine.states;

import practise.vending_machine.VendingMachineContext;
import practise.vending_machine.payment.PaymentFactory;
import practise.vending_machine.payment.PaymentStrategy;

import java.util.Scanner;

public class ProductSelectionState extends AbstractVendingState {

    @Override
    public String getStateName() {
        return "PRODUCT_SELECTION";
    }

    @Override
    public void transitionToNextState(VendingMachineContext context) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Vending Machine ===");

        System.out.print("Enter shelf code to select product");
        int code = scanner.nextInt();

        System.out.print("Enter payment method");
        String paymentMethod  = scanner.next();

        PaymentStrategy paymentStrategy = PaymentFactory
                .getPaymentStrategy(paymentMethod);
        AbstractVendingState newState = new PaymentState(paymentStrategy, code);
        context.setCurrentState(newState);
        scanner.close();
    }
}
