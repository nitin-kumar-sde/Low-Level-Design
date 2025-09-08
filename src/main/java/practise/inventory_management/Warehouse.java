package practise.inventory_management;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Warehouse {

    private final String warehouseId;
    private String name;
    private final Map<ProductCategory, StockRecord> stockByCategory;

    public Warehouse(String name) {
        this.warehouseId = UUID.randomUUID().toString();
        this.name = name;
        this.stockByCategory = new HashMap<>();
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStock(ProductCategory category, int quantity) {

        final StockRecord record = stockByCategory.get(category);
        if(record == null) stockByCategory.put(category, new StockRecord(category, quantity, 10));
        else record.setCurrentStock(record.getCurrentStock() + quantity);
        stockByCategory.put(category, record);
        System.out.println("✅ Added " + quantity + " units to category " + category);
    }

    // Remove stock for category
    public boolean removeStock(ProductCategory category, int quantity) {
        if (!stockByCategory.containsKey(category)) {
            System.out.println("⚠️ No stock record found for " + category);
            return false;
        }
        StockRecord record = stockByCategory.get(category);
        if (record.getCurrentStock() < quantity) {
            System.out.println("⚠️ Not enough stock to remove for " + category);
            return false;
        }
        record.setCurrentStock(record.getCurrentStock() - quantity);
        System.out.println("🗑️ Removed " + quantity + " units from category " + category);
        return true;
    }

    // Get stock record by category
    public StockRecord getStockRecord(ProductCategory category) {
        return stockByCategory.get(category);
    }

    // Get all stock records
    public Map<ProductCategory, StockRecord> getAllStockRecords() {
        return Collections.unmodifiableMap(stockByCategory);
    }

    public boolean isBelowThreshold(ProductCategory category) {
        return stockByCategory.get(category).isBelowThreshold();
    }
}
