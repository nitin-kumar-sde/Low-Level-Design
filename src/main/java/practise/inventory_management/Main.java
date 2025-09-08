package practise.inventory_management;

import practise.inventory_management.strategies.FixedQuantityReplenishmentStrategy;


public class Main {

    public static void main(String[] args) {


        Warehouse w1 = new Warehouse("W1");
        Warehouse w2 = new Warehouse("W2");

        w1.addStock(ProductCategory.ELECTRONICS, 10);
        w1.addStock(ProductCategory.GROCERY, 10);
        w1.addStock(ProductCategory.CLOTHING, 20);
        w1.addStock(ProductCategory.FURNITURE, 20);

        w2.addStock(ProductCategory.ELECTRONICS, 20);
        w2.addStock(ProductCategory.GROCERY, 30);
        w2.addStock(ProductCategory.CLOTHING, 50);
        w2.addStock(ProductCategory.FURNITURE, 60);


        Inventory inventory = new Inventory();
        inventory.addWarehouse(w1);
        inventory.addWarehouse(w2);


        InventoryManager manager = new InventoryManager(inventory,
                new FixedQuantityReplenishmentStrategy(10));


        System.out.println("\n=== Monitoring & Replenishment ===");
        manager.monitorAndReplenish(ProductCategory.ELECTRONICS);
    }
}
