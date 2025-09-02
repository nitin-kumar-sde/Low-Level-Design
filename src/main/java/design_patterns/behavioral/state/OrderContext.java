package design_patterns.behavioral.state;

import design_patterns.behavioral.state.states.CreatedState;
import design_patterns.behavioral.state.states.OrderState;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new CreatedState(); // default initial state
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}
