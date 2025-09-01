package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.factories.VehicleFactory;
import design_patterns.creational.abstract_factory.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {

        // Get a Regular Vehicle Factory
        VehicleFactory regularFactory = FactoryProvider.getFactory("regular");
        Vehicle regularCar = regularFactory.createCar();
        Vehicle regularBike = regularFactory.createBike();

        regularCar.start();
        regularCar.stop();

        regularBike.start();
        regularBike.stop();

        // Get a Luxury Vehicle Factory
        VehicleFactory luxuryFactory = FactoryProvider.getFactory("luxury");
        Vehicle luxuryCar = luxuryFactory.createCar();
        Vehicle luxuryBike = luxuryFactory.createCar();

        luxuryCar.start();
        luxuryCar.stop();

        luxuryBike.start();
        luxuryBike.stop();
    }
}
