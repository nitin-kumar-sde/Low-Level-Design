package practise.inventory_management;

import java.util.UUID;

public class Product {

    private final UUID productId;
    private String name;
    private ProductCategory category;
    private double price;

    public Product(final String name, final ProductCategory category,
                   final double price) {
        this.productId = UUID.randomUUID();
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public UUID getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
