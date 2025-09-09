package practise.car_booking.actors;

public class Rider extends User {

    public Rider(String id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Rider{id='" + getId() + "', name='" + getName() + "'}";
    }
}