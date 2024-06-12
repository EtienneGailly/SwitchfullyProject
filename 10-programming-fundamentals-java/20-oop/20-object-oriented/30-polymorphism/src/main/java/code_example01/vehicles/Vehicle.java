package code_example01.vehicles;

import code_example01.vehicles.engines.Engine;

public abstract class Vehicle {

    private String name;
    private int numberOfWheels;
    private int numberOfGears;
    private Engine engine;

    public Vehicle(String name, int numberOfWheels, int numberOfGears, Engine engine) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.numberOfGears = numberOfGears;
        this.engine = engine;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public abstract String honk();
}
