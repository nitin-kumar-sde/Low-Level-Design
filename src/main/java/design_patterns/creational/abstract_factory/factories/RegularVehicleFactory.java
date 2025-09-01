package design_patterns.creational.abstract_factory.factories;

import design_patterns.creational.abstract_factory.vehicle.Bike;
import design_patterns.creational.abstract_factory.vehicle.Car;
import design_patterns.creational.abstract_factory.vehicle.Vehicle;

public class RegularVehicleFactory implements VehicleFactory {
    public Vehicle createCar() {
        return new Car();
    }

    public Vehicle createBike() {
        return new Bike();
    }
}
