package basic.solutions.codelab01;

public class Engine {
    private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "engine with " + horsepower + " horse-power";
    }
}
