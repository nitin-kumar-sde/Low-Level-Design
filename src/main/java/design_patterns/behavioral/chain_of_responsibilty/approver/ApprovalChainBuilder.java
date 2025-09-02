package design_patterns.behavioral.chain_of_responsibilty.approver;


/**
 * Builder class to build the chain of approvers.
 */
public class ApprovalChainBuilder {

    public static Approver getChain() {
        final Approver manager = new Manager();
        final Approver director = new Director();
        final Approver ceo = new CEO();

        manager.setNext(director);
        director.setNext(ceo);

        return manager; // Head of the chain
    }
}
