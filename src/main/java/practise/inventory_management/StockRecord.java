package practise.inventory_management;

public class StockRecord {

    private final ProductCategory category;

    private int currentStock;

    private final int minThreshold;
    public StockRecord(ProductCategory category, int currentStock, int minThreshold) {
        this.category = category;
        this.currentStock = currentStock;
        this.minThreshold = minThreshold;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public int getMinThreshold() {
        return minThreshold;
    }

    public void incrementStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        this.currentStock += quantity;
    }

    public void decrementStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        if (this.currentStock < quantity) {
            throw new IllegalStateException("Not enough stock available");
        }
        this.currentStock -= quantity;
    }

    public boolean isBelowThreshold() {
        return currentStock < minThreshold;
    }

}
