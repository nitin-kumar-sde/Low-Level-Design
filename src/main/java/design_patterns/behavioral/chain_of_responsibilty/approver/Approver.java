package design_patterns.behavioral.chain_of_responsibilty.approver;

import design_patterns.behavioral.chain_of_responsibilty.ExpenseRequest;

/**
 * Abstract class representing an approver in the chain of responsibility.
 */
public abstract class Approver {

    protected Approver nextApprover;

    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void approve(ExpenseRequest request) {
        if (canApprove(request.getAmount())) {
            approveRequest(request);
        } else if (nextApprover != null) {
            nextApprover.approve(request);
        } else {
            System.out.println("🚫 No one can approve this expense: " + request.getAmount());
        }
    }

    protected abstract boolean canApprove(double amount);
    protected abstract void approveRequest(ExpenseRequest request);
}

