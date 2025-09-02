package design_patterns.behavioral.template;

/**
 * CarAssembly is a concrete implementation of VehicleAssembly for assembling cars.
 */
public class CarAssembly extends VehicleAssembly {

    @Override
    protected void assembleChassis() {
        System.out.println("🔧 Assembling car chassis...");
    }

    @Override
    protected void installEngine() {
        System.out.println("⚙️ Installing 4-cylinder engine...");
    }

    @Override
    protected void paint() {
        System.out.println("🎨 Painting car in metallic red...");
    }
}

