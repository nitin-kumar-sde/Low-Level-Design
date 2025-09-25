package practise.payment_gateway.model;

public class Transaction {

    private final String transactionId;
    private final String requestId;       // Idempotency key from PaymentRequest
    private final String payerId;
    private final String payeeId;
    private final Double amount;
    private Status status;

    public Transaction(String transactionId, String requestId, String payerId, String payeeId, Double amount) {
        this.transactionId = transactionId;
        this.requestId = requestId;
        this.payerId = payerId;
        this.payeeId = payeeId;
        this.amount = amount;
        this.status = Status.INITIATED;
    }

    public Double getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getPayerId() {
        return payerId;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
