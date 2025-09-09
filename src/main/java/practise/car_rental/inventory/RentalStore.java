package practise.car_rental.inventory;

import practise.car_rental.filter.VehicleFilter;
import practise.car_rental.vehicles.Vehicle;
import java.util.*;
import java.util.stream.Collectors;

public class RentalStore {

    private final UUID id;
    private final List<Vehicle> vehicles;

    public RentalStore(UUID id) {
        this.id = id;
        this.vehicles = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void addVehicle(final Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(final Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return Collections.unmodifiableList(vehicles);
    }

    public List<Vehicle> getAvailableVehicles() {
        return vehicles.stream()
                .filter(Vehicle::isAvailable)
                .collect(Collectors.toList());
    }

    public List<Vehicle> filterVehicles(VehicleFilter filter) {
        return filter.apply(vehicles);
    }

}

