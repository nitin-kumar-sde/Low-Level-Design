package practise.movie_booking_system.model;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private final Integer screenId;
    private final String name;
    private final Theatre theatre;
    private final int capacity;
    private final List<Seat> seats;

    public Screen(Integer screenId, String name, Theatre theatre,
                  int capacity) {
        this.screenId = screenId;
        this.name = name;
        this.theatre = theatre;
        this.capacity = capacity;
        this.seats = new ArrayList<>();
    }

    public Integer getScreenId() {
        return screenId;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void addSeat(final Seat seat) {

        this.seats.add(seat);
    }
}
