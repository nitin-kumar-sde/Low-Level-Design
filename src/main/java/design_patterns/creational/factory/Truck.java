package design_patterns.creational.factory;

public class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck started. Heavy load ready!");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped.");
    }
}
