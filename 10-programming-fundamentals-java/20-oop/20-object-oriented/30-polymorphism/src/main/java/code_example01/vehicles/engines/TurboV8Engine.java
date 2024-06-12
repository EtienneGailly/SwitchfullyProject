package code_example01.vehicles.engines;

public class TurboV8Engine extends Engine{

    public TurboV8Engine(int amountOfHorsepower) {
        super(amountOfHorsepower, true);
    }

    @Override
    public String start() {
        return "Starting V8, hear it roar!";
    }

    @Override
    public String stop() {
        return "Stopping V8";
    }
}
