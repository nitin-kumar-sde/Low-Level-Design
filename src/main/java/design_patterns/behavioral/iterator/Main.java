package design_patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {

        VehicleCollection collection = new VehicleCollection();
        collection.addVehicle("🚗 Car");
        collection.addVehicle("🏍 Bike");
        collection.addVehicle("🚚 Truck");


        // Create an iterator for the collection
        Iterator<String> iterator = collection.iterator();

        // Traverse the collection using the iterator
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
