package practise.car_rental.vehicles;


public abstract class Vehicle {

    private final String vehicleId;

    private VehicleStatus vehicleStatus;

    public Vehicle(final String vehicleId) {
        this.vehicleId = vehicleId;
        this.vehicleStatus = VehicleStatus.AVAILABLE;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public boolean isAvailable() {
        return this.vehicleStatus == VehicleStatus.AVAILABLE;
    }
}
