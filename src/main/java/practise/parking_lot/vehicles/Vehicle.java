package practise.parking_lot.vehicles;

public abstract class Vehicle {

    private final String id;

    public Vehicle(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

