package basic.solutions.codelab01;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class Car {
    private Engine engine;
    private Driver driver;
    private Passenger[] passengers;

    public Car(Engine engine, Driver driver, Passenger[] passengers) {
        this.engine = engine;
        this.driver = driver;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "I am car with " + passengers.length + " passenger(s) (" + Arrays.stream(passengers).map(Passenger::getName).collect(joining(", ")) + "), " + driver + " and " + engine;
    }
}
