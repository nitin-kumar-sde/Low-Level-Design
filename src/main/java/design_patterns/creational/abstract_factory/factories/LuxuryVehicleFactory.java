package design_patterns.creational.abstract_factory.factories;

import design_patterns.creational.abstract_factory.vehicle.LuxuryBike;
import design_patterns.creational.abstract_factory.vehicle.LuxuryCar;
import design_patterns.creational.abstract_factory.vehicle.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory {
    public Vehicle createCar() {
        return new LuxuryCar();
    }

    public Vehicle createBike() {
        return new LuxuryBike();
    }
}