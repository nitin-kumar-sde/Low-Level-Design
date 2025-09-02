package design_patterns.behavioral.chain_of_responsibilty.approver;

import design_patterns.behavioral.chain_of_responsibilty.ExpenseRequest;

/**
 * Director class that can approve expenses up to ₹100,000.
 */
public class CEO extends Approver {

    @Override
    protected boolean canApprove(double amount) {
        return amount < 100000;
    }

    @Override
    protected void approveRequest(ExpenseRequest request) {
        System.out.println("🏆 CEO approved ₹" + request.getAmount() +
                " for " + request.getEmployeeName());
    }
}
