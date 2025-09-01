package design_patterns.creational.prototype;

public class Vehicle implements Cloneable {
    private String brand;

    private int topSpeed;

    public Vehicle(final String brand, final int topSpeed) {
        this.brand = brand;
        this.topSpeed = topSpeed;
    }

    void setBrand(String brand) {
         this.brand = brand;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public Vehicle clone() {
        // put custom logic - Deep vs Shallow copy
        return new Vehicle(this.brand, this.topSpeed);
    }

    @Override
    public String toString() {
        return "Car { brand='" + brand + "', topSpeed=" + topSpeed + " }";
    }
}
