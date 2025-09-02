package design_patterns.behavioral.state.states;

import design_patterns.behavioral.state.OrderContext;

/**
 * Concrete state representing the "Delivered" state of an order.
 */
public class DeliveredState implements OrderState {
    @Override
    public void next(OrderContext order) {
        System.out.println("⚠️ Order is already delivered. No further transition.");
    }

    @Override
    public String getStatus() {
        return "Delivered";
    }
}
