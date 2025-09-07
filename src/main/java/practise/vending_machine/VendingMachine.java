package practise.vending_machine;

import practise.vending_machine.inventory.Inventory;

public class VendingMachine {

    private final Inventory inventory;
    private final VendingMachineContext vendingMachineContext;

    public VendingMachine(Inventory inventory, VendingMachineContext vendingMachineContext) {
        this.inventory = inventory;
        this.vendingMachineContext = vendingMachineContext;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public VendingMachineContext getVendingMachineContext() {
        return vendingMachineContext;
    }

    public void selectProduct() {
        // currently in Idle state
        vendingMachineContext.transitionToNextState();
    }
}
