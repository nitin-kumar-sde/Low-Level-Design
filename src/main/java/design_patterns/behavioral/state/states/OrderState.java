package design_patterns.behavioral.state.states;

import design_patterns.behavioral.state.OrderContext;

/**
 * State interface for order processing.
 */
public interface OrderState {
    void next(OrderContext order);
    String getStatus();
}

