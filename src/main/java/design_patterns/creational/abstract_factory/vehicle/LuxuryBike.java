package design_patterns.creational.abstract_factory.vehicle;

public class LuxuryBike implements Vehicle {
    public void start() {
        System.out.println("Luxury Bike started with smart ignition.");
    }
    public void stop() {
        System.out.println("Luxury Bike stopped safely.");
    }
}