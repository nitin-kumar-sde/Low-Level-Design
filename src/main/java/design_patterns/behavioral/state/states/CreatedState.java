package design_patterns.behavioral.state.states;

import design_patterns.behavioral.state.OrderContext;

/*
 * Concrete state representing the "Created" state of an order.
 */
public class CreatedState implements OrderState {
    @Override
    public void next(OrderContext order) {
        System.out.println("💳 Payment processed. Moving to PAID state.");
        order.setState(new PaidState());
    }

    @Override
    public String getStatus() {
        return "Created";
    }
}

