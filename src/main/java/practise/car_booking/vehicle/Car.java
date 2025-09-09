package practise.car_booking.vehicle;


public class Car extends Vehicle {

    private final String model;

    public Car(String vehicleId, String plateNumber, String model) {
        super(vehicleId, plateNumber);
        this.model = model;
    }

    public String getModel() { return model; }

}
