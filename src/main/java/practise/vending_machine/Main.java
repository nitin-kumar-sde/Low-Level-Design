package practise.vending_machine;

import practise.vending_machine.inventory.Inventory;

public class Main {
    public static void main(String[] args) {

        final Inventory inventory = new Inventory(10);
        final VendingMachineContext context = new VendingMachineContext();

        final VendingMachine machine = new VendingMachine(inventory, context);

        machine.selectProduct();
    }

}
