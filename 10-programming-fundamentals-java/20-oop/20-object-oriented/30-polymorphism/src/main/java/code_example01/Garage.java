package code_example01;

import code_example01.vehicles.Vehicle;

public class Garage {

    private static final int MAX_ALLOWED_CARS = 3;
    private Vehicle[] vehicles;

    public Garage() {
        this.vehicles = new Vehicle[3];
    }

    public Garage(Vehicle[] vehicles) {
        this.setVehicles(vehicles);
    }

    private void setVehicles(Vehicle[] vehicles) {
        if (vehicles != null && vehicles.length <= MAX_ALLOWED_CARS) {
            this.vehicles = vehicles;
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
}
