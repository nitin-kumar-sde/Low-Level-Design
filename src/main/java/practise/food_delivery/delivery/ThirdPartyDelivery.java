package practise.food_delivery.delivery;

import practise.food_delivery.model.Order;
import practise.food_delivery.model.OrderStatus;

public class ThirdPartyDelivery implements DeliveryStrategy {

    @Override
    public void deliver(Order order) {
        System.out.println("📦 Delivering order " + order.getOrderId() + " via third-party aggregator.");
        order.updateState(OrderStatus.OUT_FOR_DELIVERY);
    }
}
