package practise.inventory_management;

import java.util.*;

public class Inventory {

    private final List<Warehouse> warehouses;

    public Inventory() {
        this.warehouses = new ArrayList<>();
    }

    // Add or remove a warehouse
    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public void removeWarehouse(Warehouse warehouse) {
        warehouses.remove(warehouse);
    }

    public List<Warehouse> getWarehouses() {
        return Collections.unmodifiableList(warehouses);
    }

    public int getTotalStock(ProductCategory category) {
        return warehouses.stream()
                .mapToInt(wh -> wh.getStockRecord(category)
                        .getCurrentStock())
                .sum();
    }


    public Optional<Warehouse> findWarehouseWithStock(ProductCategory category, int requiredQuantity) {
        return warehouses.stream()
                .filter(wh -> wh.getStockRecord(category).getCurrentStock()
                        >= requiredQuantity)
                .findFirst();
    }

    public List<Warehouse> getWarehousesBelowThreshold(ProductCategory category) {
        List<Warehouse> result = new ArrayList<>();

        for (Warehouse wh : warehouses) {
            if (wh.isBelowThreshold(category)) {
                result.add(wh);
            }
        }
        return result;
    }

    public void printStockSummary() {

        System.out.println("=== Inventory Stock Summary ===");
        for (Warehouse wh : warehouses) {
            System.out.println("Warehouse: " + wh.getWarehouseId());

            Map<ProductCategory, StockRecord> allStockRecords = wh.getAllStockRecords();

            for (StockRecord record : allStockRecords.values()) {
                System.out.println("  " + record.getCategory() +
                        " -> current: " + record.getCurrentStock() +
                        ", minThreshold: " + record.getMinThreshold());
            }
        }
    }

    public boolean transfer(ProductCategory category, int quantity, Warehouse from, Warehouse to) {

        int available = from.getStockRecord(category).getCurrentStock();

        if (available < quantity) {
            // Ideally should be handled via exception
            System.out.println("⚠️ Not enough stock in warehouse " + from.getWarehouseId());
            return false;
        }

        boolean deducted = from.removeStock(category, quantity);

        if (!deducted) {
            System.out.println("⚠️ Failed to deduct stock from " + from.getWarehouseId());
            return false;
        }


        to.addStock(category, quantity);

        System.out.println("✅ Transferred " + quantity + " units of " + category +
                " from " + from.getWarehouseId() + " to " + to.getWarehouseId());
        return true;
    }

}
