package design_patterns.behavioral.chain_of_responsibilty;

/**
 * ExpenseRequest represents a request for expense approval.
 */
public class ExpenseRequest {
    private final String employeeName;
    private final double amount;

    public ExpenseRequest(String employeeName, double amount) {
        this.employeeName = employeeName;
        this.amount = amount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getAmount() {
        return amount;
    }
}

