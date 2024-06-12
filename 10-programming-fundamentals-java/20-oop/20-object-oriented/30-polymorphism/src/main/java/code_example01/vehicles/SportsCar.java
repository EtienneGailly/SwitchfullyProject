package code_example01.vehicles;

import code_example01.vehicles.engines.TurboV8Engine;

public class SportsCar extends Vehicle {

    private static final int NUMBER_OF_WHEELS = 4;

    public SportsCar(String name, int numberOfGears, TurboV8Engine turboV8Engine) {
        super(name, NUMBER_OF_WHEELS, numberOfGears, turboV8Engine);
    }

    @Override
    public String honk() {
        return "Tudududu du du dududu du du du tuuu!";
    }
}
