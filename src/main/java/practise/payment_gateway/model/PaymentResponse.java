package practise.payment_gateway.model;

public class PaymentResponse {

    private final String transactionId;

    public PaymentResponse(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
