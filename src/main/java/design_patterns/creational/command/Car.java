package design_patterns.creational.command;

public class Car {
    public void start() {
        System.out.println("🚗 Car started.");
    }

    public void stop() {
        System.out.println("🛑 Car stopped.");
    }

    public void accelerate() {
        System.out.println("⚡ Car accelerated.");
    }
}
