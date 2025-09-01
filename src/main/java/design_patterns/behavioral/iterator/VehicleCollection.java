package design_patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Collection class that implements the Collection interface
 * and provides an iterator for traversing a list of vehicles.
 */
public class VehicleCollection implements Collection<String> {

    private final List<String> vehicles = new ArrayList<>();

    public void addVehicle(String vehicle) {
        vehicles.add(vehicle);
    }


    @Override
    public Iterator<String> iterator() {
        return new VehicleIterator();
    }

    // Inner Iterator class
    private class VehicleIterator implements Iterator<String> {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < vehicles.size();
        }

        @Override
        public String next() {
            return vehicles.get(position++);
        }
    }
}

