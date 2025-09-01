package design_patterns.creational.builder;

public class Main {

    public static void main(String[] args) {

        // Build a Car with custom attributes
        Vehicle car = new Vehicle.VehicleBuilder()
                .withType("Car")
                .withWheels(4)
                .withColor("Black")
                .withEngine("2000cc Turbo")
                .withEnableGPS(true)
                .build();

        System.out.println(car);
    }
}
