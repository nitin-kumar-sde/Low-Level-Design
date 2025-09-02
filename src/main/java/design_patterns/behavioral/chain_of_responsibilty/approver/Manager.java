package design_patterns.behavioral.chain_of_responsibilty.approver;

import design_patterns.behavioral.chain_of_responsibilty.ExpenseRequest;

/**
 * Manager class that can approve expenses up to ₹10,000.
 */
public class Manager extends Approver {

    @Override
    protected boolean canApprove(double amount) {
        return amount <= 10000;
    }

    @Override
    protected void approveRequest(ExpenseRequest request) {
        System.out.println("👔 Manager approved ₹" + request.getAmount() +
                " for " + request.getEmployeeName());
    }
}

