package examples.code_example00_from_slides.partybus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

class PartyBusTestV3 {

    private PartyBus bus;

    @BeforeEach
    void setUpPartyBus() {
        bus = new PartyBus(new Person("Otto Mann"));
    }

    @Test
    void hopOn_givenAPartyBusWithAvailableRoom_thenPassengerContainedInPassengersOfBus() {
        Person expectedPassenger = new Person("Bart Simpson");

        bus.hopOn(expectedPassenger);

        Assertions.assertIterableEquals(bus.getPassengers(), asList(expectedPassenger));
    }

    @Test
    void hopOn_givenAPartyBusWithNoRoomLeft_thenPassengerNotContainedInPassengersOfBus() {
        List<Person> givenPassengers = generatePersons(PartyBus.MAX_AMOUNT_OF_PASSENGERS);
        letEveryPersonHopOnTheBus(givenPassengers, bus);

        bus.hopOn(new Person("Bart Simpson"));

        Assertions.assertIterableEquals(bus.getPassengers(), givenPassengers);
    }

    @Test
    void hopOff_givenAPartyBusContainingThePassenger_thenPassengerNoLongerOnBus() {
        List<Person> givenPassengers = generatePersons(PartyBus.MAX_AMOUNT_OF_PASSENGERS);
        letEveryPersonHopOnTheBus(givenPassengers, bus);
        Person passengerToHopOff = givenPassengers.get(0);

        bus.hopOff(passengerToHopOff);

        Assertions.assertEquals(bus.getPassengers().size(), givenPassengers.size() - 1);
        Assertions.assertFalse(bus.getPassengers().contains(passengerToHopOff));

    }

    @Test
    void hopOff_givenAPartyBusNotContainingThePassenger_thenThrowException() {
        Person notAPassenger = new Person("Bart Simpson");

        Executable whenMethod = () -> bus.hopOff(notAPassenger);

        Assertions.assertThrows(IllegalArgumentException.class, whenMethod,
                        format("A passenger can only hop off the bus if it was already on the bus. " +
                                "Passenger %s was not on the bus.", notAPassenger));
    }

    private void letEveryPersonHopOnTheBus(List<Person> personsToHopOn, PartyBus busToHopOnTo) {
        for (Person person: personsToHopOn) {
            busToHopOnTo.hopOn(person);
        }
    }

    private List<Person> generatePersons(short amountOfPersons) {
        List<Person> givenPassengers = new ArrayList<>();
        for (int i = 0; i < amountOfPersons; i++) {
            givenPassengers.add(new Person(format("Mr. Generic Passenger %s", i)));
        }
        return givenPassengers;
    }

}
