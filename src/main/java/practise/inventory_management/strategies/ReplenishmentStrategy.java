package practise.inventory_management.strategies;

import practise.inventory_management.ProductCategory;
import practise.inventory_management.Warehouse;

public interface ReplenishmentStrategy {
    void replenish(Warehouse warehouse, ProductCategory category);
}

