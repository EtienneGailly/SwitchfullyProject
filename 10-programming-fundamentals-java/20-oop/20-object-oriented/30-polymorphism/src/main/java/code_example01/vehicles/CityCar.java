package code_example01.vehicles;

import code_example01.vehicles.engines.Engine;

public class CityCar extends Vehicle {

    public CityCar(String name, int numberOfWheels, int numberOfGears, Engine engine) {
        super(name, numberOfWheels, numberOfGears, engine);
    }

    @Override
    public String honk() {
        return "Tuut tuut";
    }
}
