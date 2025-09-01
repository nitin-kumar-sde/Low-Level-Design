package design_patterns.creational.abstract_factory.vehicle;

public class LuxuryCar implements Vehicle {
    public void start() {
        System.out.println("Luxury Car started with autopilot.");
    }
    public void stop() {
        System.out.println("Luxury Car stopped with auto-parking.");
    }
}
