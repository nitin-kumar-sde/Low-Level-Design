package practise.inventory_management.strategies;


import practise.inventory_management.ProductCategory;
import practise.inventory_management.StockRecord;
import practise.inventory_management.Warehouse;

public class ReorderToLevelReplenishmentStrategy implements ReplenishmentStrategy {

    private final int reorderLevel;

    public ReorderToLevelReplenishmentStrategy(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    @Override
    public void replenish(Warehouse warehouse, ProductCategory category) {

        final StockRecord record = warehouse.getStockRecord(category);
        if (record == null) {
            System.out.println("⚠️ No stock record found for category " + category);
            return;
        }

        int currentStock = record.getCurrentStock();
        if (currentStock < reorderLevel) {
            int addQuantity = reorderLevel - currentStock;
            warehouse.addStock(category, addQuantity);
            System.out.println("✅ Replenished " + addQuantity +
                    " units of " + category +
                    " at Warehouse " + warehouse.getWarehouseId() +
                    " (brought to reorder level " + reorderLevel + ")");
        }
    }
}
