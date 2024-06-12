package code_example01.vehicles.engines;

public abstract class Engine {

    private int amountOfHorsepower;
    private boolean hasHighConsumption;

    public Engine(int amountOfHorsepower, boolean hasHighConsumption) {
        this.amountOfHorsepower = amountOfHorsepower;
        this.hasHighConsumption = hasHighConsumption;
    }

    public abstract String start();

    public abstract String stop();

    public int getAmountOfHorsepower() {
        return amountOfHorsepower;
    }

    public boolean hasHighConsumpotion() {
        return hasHighConsumption;
    }
}
