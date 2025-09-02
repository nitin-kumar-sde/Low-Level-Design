package design_patterns.structural.facade;

import design_patterns.structural.facade.service.CleaningService;
import design_patterns.structural.facade.service.EngineService;
import design_patterns.structural.facade.service.FuelService;

/**
 * Facade class that simplifies the interaction with various vehicle services.
 */
public class VehicleServiceFacade {

        private final EngineService engineService;
        private final CleaningService cleaningService;
        private final FuelService fuelService;

        public VehicleServiceFacade() {
            this.engineService = new EngineService();
            this.cleaningService = new CleaningService();
            this.fuelService = new FuelService();
        }

        public void fullService() {
            System.out.println("🚗 Starting full vehicle service...");
            engineService.checkEngine();
            engineService.repairEngine();
            cleaningService.cleanInterior();
            cleaningService.washExterior();
            fuelService.refuel();
            System.out.println("✅ Vehicle service completed!");
        }

}
