package design_patterns.creational.abstract_factory.factories;

import design_patterns.creational.abstract_factory.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle createCar();
    Vehicle createBike();
}
