package design_patterns.behavioral.state.states;

import design_patterns.behavioral.state.OrderContext;

/**
 * Concrete state representing the "Shipped" state of an order
 */
public class ShippedState implements OrderState {
    @Override
    public void next(OrderContext order) {
        System.out.println("📬 Order delivered. Moving to DELIVERED state.");
        order.setState(new DeliveredState());
    }

    @Override
    public String getStatus() {
        return "Shipped";
    }
}

