package code_example01.vehicles.engines;

public class RegularEngine extends Engine {

    public RegularEngine(int amountOfHorsepower) {
        super(amountOfHorsepower, false);
    }

    @Override
    public String start() {
        return "Starting regular engine";
    }

    @Override
    public String stop() {
        return "Stopping regular engine";
    }
}
