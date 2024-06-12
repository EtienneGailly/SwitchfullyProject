package examples.code_example00_from_slides.partybus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartyBus {

    private final List<Person> passengers;
    private final Person driver;

    public static final short MAX_AMOUNT_OF_PASSENGERS = 5;

    public PartyBus(Person driver) {
        passengers = new ArrayList<>();
        this.driver = driver;
    }

    public Person getDriver() {
        return driver;
    }

    public List<Person> getPassengers() {
        return Collections.unmodifiableList(passengers);
    }

    public void hopOn(Person passenger) {
        if (passengers.size() < MAX_AMOUNT_OF_PASSENGERS) {
            passengers.add(passenger);
        }
    }

    public void hopOff(Person passenger) {
        if(!passengers.remove(passenger)) {
            throw new IllegalArgumentException(String.format("A passenger can only hop off the bus if it was already " +
                    "on the bus. Passenger %s was not on the bus.", passenger));
        }
    }

}
