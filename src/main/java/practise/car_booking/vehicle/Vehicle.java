package practise.car_booking.vehicle;

public abstract class Vehicle {

    private final String vehicleId;
    private final String plateNumber;

    protected Vehicle(String vehicleId, String plateNumber) {
        this.vehicleId = vehicleId;
        this.plateNumber = plateNumber;
    }

    public String getVehicleId() { return vehicleId; }
    public String getPlateNumber() { return plateNumber; }

}

