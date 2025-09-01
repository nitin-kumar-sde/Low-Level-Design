package design_patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        VehicleSingleton vehicle1 = VehicleSingleton.getInstance();
        VehicleSingleton vehicle2 = VehicleSingleton.getInstance();

        vehicle1.startEngine();

        System.out.println(vehicle1 == vehicle2); // true -> Both are the same instance
    }
}

