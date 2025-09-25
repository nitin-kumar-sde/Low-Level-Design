package practise.payment_gateway.strategy;

import practise.payment_gateway.model.PaymentRequest;
import practise.payment_gateway.model.PaymentResponse;
import practise.payment_gateway.model.Status;
import practise.payment_gateway.model.Transaction;
import practise.payment_gateway.retries.RetryPolicy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private final RetryPolicy retryPolicy;

    public CreditCardPaymentStrategy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    @Override
    public PaymentResponse pay(PaymentRequest request) throws InterruptedException {
        // handle idempotency, based on request ID, check if any transaction
        // already exists or not
        System.out.println("Paid " + request.getAmount() + " using credit card");

        final Transaction transaction = new Transaction(request.getRequestId(), request.getRequestId(),
                request.getPayerId(), request.getPayeeId(), request.getAmount());

        // call third party service.
        int attempt = 0;
        long delay = retryPolicy.getInitialDelayMillis();
        while (attempt < retryPolicy.getMaxAttempts()) {
            attempt++;
            // if failed retry...
            Thread.sleep(delay);

            // if succeeds
            System.out.println("Succeeded in " + attempt + " attempt");
        }
        // set status by making third party call
        transaction.setStatus(Status.SUCCESS);
        return new PaymentResponse(transaction.getTransactionId());
    }

}
