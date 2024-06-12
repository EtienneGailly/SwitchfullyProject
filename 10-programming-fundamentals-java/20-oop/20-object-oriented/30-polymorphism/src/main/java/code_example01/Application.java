package code_example01;

import code_example01.vehicles.CityCar;
import code_example01.vehicles.SportsCar;
import code_example01.vehicles.Vehicle;
import code_example01.vehicles.engines.RegularEngine;
import code_example01.vehicles.engines.TurboV8Engine;

public class Application {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new CityCar("Reliant Robin", 3, 5, new RegularEngine(10)),
                new CityCar("Audi A6", 4, 6, new TurboV8Engine(250)),
                new SportsCar("Ferrari DeFerrari", 7, new TurboV8Engine(800))
        };

        Garage garage = new Garage(vehicles);

        for (Vehicle vehicle : garage.getVehicles()) {
            System.out.println(String.format("I'm a vehicle called: %s", vehicle.getName()));
            System.out.println(String.format("\tMy sound if I press the honk: %s", vehicle.honk()));
            System.out.println(String.format("\tEngine on: %s", vehicle.getEngine().start()));
            System.out.println(String.format("\tEngine off: %s", vehicle.getEngine().stop()));
        }
    }

}
