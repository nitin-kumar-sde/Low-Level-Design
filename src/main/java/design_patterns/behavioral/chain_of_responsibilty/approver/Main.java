package design_patterns.behavioral.chain_of_responsibilty.approver;

import design_patterns.behavioral.chain_of_responsibilty.ExpenseRequest;

public class Main {

    public static void main(String[] args) {
        Approver approvalChain = ApprovalChainBuilder.getChain();

        approvalChain.approve(new ExpenseRequest("Nitin",
                5000));
        approvalChain.approve(new ExpenseRequest("John",
                30000));
        approvalChain.approve(new ExpenseRequest("Alice",
                100000));
    }
}
