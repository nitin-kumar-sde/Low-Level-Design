package design_patterns.structural.facade.service;

import design_patterns.structural.facade.VehicleServiceFacade;

public class Main {

    public static void main(String[] args) {
        VehicleServiceFacade serviceFacade = new VehicleServiceFacade();
        // Single call instead of dealing with subsystems
        serviceFacade.fullService();
    }
}
