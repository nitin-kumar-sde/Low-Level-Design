package design_patterns.behavioral.template;

/**
 * Abstract class defining the template method for vehicle assembly.
 * Subclasses must implement specific steps of the assembly process.
 */
public abstract class VehicleAssembly {

    // Template method (final to prevent overriding)
    public final void assembleVehicle() {
        assembleChassis();
        installEngine();
        paint();
        testDrive();
        System.out.println("✅ Vehicle assembly completed.\n");
    }

    // Steps to be implemented by subclasses
    protected abstract void assembleChassis();
    protected abstract void installEngine();
    protected abstract void paint();

    // Common step for all vehicles
    private void testDrive() {
        System.out.println("🚗 Performing test drive...");
    }
}
