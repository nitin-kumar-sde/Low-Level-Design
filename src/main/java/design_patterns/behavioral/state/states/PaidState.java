package design_patterns.behavioral.state.states;

import design_patterns.behavioral.state.OrderContext;

/**
 * Concrete state representing the "Paid" state of an order.
 */
public class PaidState implements OrderState {
    @Override
    public void next(OrderContext order) {
        System.out.println("📦 Order shipped. Moving to SHIPPED state.");
        order.setState(new ShippedState());
    }

    @Override
    public String getStatus() {
        return "Paid";
    }
}

