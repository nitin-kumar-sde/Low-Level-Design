package design_patterns.creational.prototype;

/**
 * This class generates Vehicle Objects using Prototype Design Pattern.
 * It uses cloning to create new instances.
 */
public class VehicleFactory {

    private static final Vehicle vehicle =
            new Vehicle("BMW", 240);

    public static Vehicle createCar() {
        return vehicle.clone();
    }

    public static Vehicle createCar(final String brand) {
        Vehicle clone = vehicle.clone();
        clone.setBrand(brand);
        return clone;
    }

    public static Vehicle createCar(final int topSpeed) {
        Vehicle clone = vehicle.clone();
        clone.setTopSpeed(topSpeed);
        return clone;
    }


}
