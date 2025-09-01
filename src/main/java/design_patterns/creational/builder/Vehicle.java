package design_patterns.creational.builder;

public class Vehicle {

    private final String type;
    private final int wheels;
    private final String color;
    private final String engine;
    private final boolean gpsEnabled;

    // Private constructor to enforce usage of Builder
    private Vehicle(VehicleBuilder builder) {
        this.type = builder.type;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.engine = builder.engine;
        this.gpsEnabled = builder.gpsEnabled;
    }

    // Static Nested Builder Class
    public static class VehicleBuilder {
        private String type;
        private int wheels;
        // default values for optional parameters
        private String color = "White";
        private String engine = "Standard Engine";
        private boolean gpsEnabled = false;

        public VehicleBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public VehicleBuilder withWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public VehicleBuilder withColor(String color) {
            this.color = color;
            return this;
        }


        public VehicleBuilder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public VehicleBuilder withEnableGPS(boolean enable) {
            this.gpsEnabled = enable;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}

