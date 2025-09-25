package practise.payment_gateway.strategy;

import practise.payment_gateway.model.PaymentRequest;
import practise.payment_gateway.model.PaymentResponse;

public interface PaymentStrategy {

    PaymentResponse pay(PaymentRequest request) throws InterruptedException;
}
