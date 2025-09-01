package design_patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.createCar();
        System.out.println(vehicle1);

        Vehicle vehicle2 = VehicleFactory.createCar("Audi");
        System.out.println(vehicle2);

        Vehicle vehicle3 = VehicleFactory.createCar(280);
        System.out.println(vehicle3);
    }
}
