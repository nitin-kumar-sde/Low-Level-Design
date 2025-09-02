package design_patterns.behavioral.chain_of_responsibilty.approver;

import design_patterns.behavioral.chain_of_responsibilty.ExpenseRequest;

/**
 * Manager class that can approve expenses up to ₹50,000.
 */
public class Director extends Approver {

    @Override
    protected boolean canApprove(double amount) {
        return amount <= 50000;
    }

    @Override
    protected void approveRequest(ExpenseRequest request) {
        System.out.println("💼 Director approved ₹" + request.getAmount() +
                " for " + request.getEmployeeName());
    }
}

