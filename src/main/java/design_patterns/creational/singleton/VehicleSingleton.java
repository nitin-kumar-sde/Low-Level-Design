package design_patterns.creational.singleton;

/**
 * This class demonstrates singleton design pattern.
 */
public class VehicleSingleton {

    // Volatile ensures visibility across threads
    private static volatile VehicleSingleton instance;

    // Private constructor to prevent external instantiation
    private VehicleSingleton() {
        System.out.println("VehicleSingleton instance created!");
    }

    // Double-checked locking to ensure thread safety and performance
    public static VehicleSingleton getInstance() {

        if (instance == null) {  // First check (no locking)
            synchronized (VehicleSingleton.class) {
                if (instance == null) {  // Second check (with lock)
                    instance = new VehicleSingleton();
                }
            }
        }
        return instance;
    }

    public void startEngine() {
        System.out.println("🚗 Engine started!");
    }
}

