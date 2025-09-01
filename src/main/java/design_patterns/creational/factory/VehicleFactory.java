package design_patterns.creational.factory;

/**
 * This class is factory for creating Vehicle objects.
 * It encapsulates the instantiation logic and provides a simple interface for clients.
 * It centralizes the creation logic, making it easier to manage and extend.
 */
public class VehicleFactory {
    public static Vehicle getVehicle(String type) {


        if ("car".equalsIgnoreCase(type)) {
            // car creation logic
            return new Car();

        } else if ("truck".equalsIgnoreCase(type)) {
            // truck creation logic
            return new Truck();
        } else
            throw new IllegalArgumentException("Unknown vehicle type: " + type);
    }
}
