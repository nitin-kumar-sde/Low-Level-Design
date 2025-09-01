package design_patterns.creational.abstract_factory.vehicle;

public class Car implements Vehicle {

    public void start() {
        System.out.println("Regular Car started.");
    }
    public void stop() {
        System.out.println("Regular Car stopped.");
    }
}
