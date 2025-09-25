package practise.payment_gateway.model;

public class PaymentRequest {

    // can act as idempotency key...
    private final String requestId;
    private final String payerId;
    private final String payeeId;
    private final double amount;

    public PaymentRequest(String requestId, String payerId,
                          String payeeId, double amount) {
        this.requestId = requestId;
        this.payerId = payerId;
        this.payeeId = payeeId;
        this.amount = amount;
    }

    public String getPayerId() {
        return payerId;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public double getAmount() {
        return amount;
    }
    public String getRequestId() {
        return requestId;
    }
}
