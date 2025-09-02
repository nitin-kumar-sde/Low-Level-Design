package design_patterns.behavioral.template;

/**
 * BikeAssembly is a concrete implementation of VehicleAssembly for assembling bikes.
 */
public class BikeAssembly extends VehicleAssembly {

    @Override
    protected void assembleChassis() {
        System.out.println("🔧 Assembling bike frame...");
    }

    @Override
    protected void installEngine() {
        System.out.println("⚙️ Installing single-cylinder engine...");
    }

    @Override
    protected void paint() {
        System.out.println("🎨 Painting bike in matte black...");
    }
}
