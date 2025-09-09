package practise.car_rental.filter;

import practise.car_rental.vehicles.Vehicle;

import java.util.List;

public interface VehicleFilter {

    List<Vehicle> apply(List<Vehicle> vehicles);
}
