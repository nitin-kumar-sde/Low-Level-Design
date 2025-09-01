package design_patterns.creational.abstract_factory.vehicle;

public class Bike implements Vehicle {
    public void start() {
        System.out.println("Regular Bike started.");
    }
    public void stop() {
        System.out.println("Regular Bike stopped.");
    }
}
