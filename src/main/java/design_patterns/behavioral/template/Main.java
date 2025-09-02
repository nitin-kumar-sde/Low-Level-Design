package design_patterns.behavioral.template;

public class Main {

    public static void main(String[] args) {
        VehicleAssembly car = new CarAssembly();
        VehicleAssembly bike = new BikeAssembly();

        System.out.println("🚙 Building a Car:");
        car.assembleVehicle();

        System.out.println("🏍️ Building a Bike:");
        bike.assembleVehicle();
    }
}
