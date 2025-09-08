package practise.inventory_management;


import practise.inventory_management.strategies.ReplenishmentStrategy;

import java.util.List;

public class InventoryManager {

    private final Inventory inventory;
    private final ReplenishmentStrategy replenishmentStrategy;

    public InventoryManager(Inventory inventory,
                            ReplenishmentStrategy replenishmentStrategy) {
        this.inventory = inventory;
        this.replenishmentStrategy = replenishmentStrategy;
    }


    public void monitorAndReplenish(ProductCategory category) {
        List<Warehouse> lowStockWarehouses = inventory.getWarehousesBelowThreshold(category);

        if (lowStockWarehouses.isEmpty()) {
            System.out.println("✅ All warehouses healthy for category: " + category);
            return;
        }

        for (Warehouse wh : lowStockWarehouses) {
            System.out.println("⚠️ Low stock detected at Warehouse " + wh.getWarehouseId()
                    + " for category " + category);
            replenishmentStrategy.replenish(wh, category);
        }
    }

}
