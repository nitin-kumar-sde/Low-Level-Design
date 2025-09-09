package practise.car_rental.filter;

import practise.car_rental.vehicles.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

public class AvailableVehicleFilter implements VehicleFilter {

    @Override
    public List<Vehicle> apply(List<Vehicle> vehicles) {
        return vehicles.stream()
                .filter(Vehicle::isAvailable)
                .collect(Collectors.toList());
    }
}