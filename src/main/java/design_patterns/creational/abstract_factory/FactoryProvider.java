package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.factories.LuxuryVehicleFactory;
import design_patterns.creational.abstract_factory.factories.RegularVehicleFactory;
import design_patterns.creational.abstract_factory.factories.VehicleFactory;

public class FactoryProvider {

    public static VehicleFactory getFactory(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Factory type must not be null.");
        }

       if("regular".equalsIgnoreCase(type)) {
           return new RegularVehicleFactory();

       } else if("luxury".equalsIgnoreCase(type)) {
           return new LuxuryVehicleFactory();
       }
       else {
           throw new IllegalArgumentException("Unknown factory type: " + type);
       }
    }
}