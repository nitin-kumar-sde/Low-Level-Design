package design_patterns.creational.factory;

public class Main {

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.start();
        car.stop();

        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.start();
        truck.stop();
    }

}
