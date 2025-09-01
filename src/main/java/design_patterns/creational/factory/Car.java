package design_patterns.creational.factory;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car started. Ready to drive!");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}
