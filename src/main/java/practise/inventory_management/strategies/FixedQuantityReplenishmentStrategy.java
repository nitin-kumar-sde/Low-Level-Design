package practise.inventory_management.strategies;


import practise.inventory_management.ProductCategory;
import practise.inventory_management.Warehouse;

public class FixedQuantityReplenishmentStrategy implements ReplenishmentStrategy {

    private final int replenishQuantity;

    public FixedQuantityReplenishmentStrategy(int replenishQuantity) {
        this.replenishQuantity = replenishQuantity;
    }

    @Override
    public void replenish(Warehouse warehouse, ProductCategory category) {

        warehouse.addStock(category, replenishQuantity);
        System.out.println("✅ Replenished " + replenishQuantity +
                " units of " + category +
                " at Warehouse " + warehouse.getWarehouseId());
    }
}
