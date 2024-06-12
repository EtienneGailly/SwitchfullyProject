package examples.code_example00_from_slides.partybus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

class PartyBusTestV1 {

    @Test
    void hopOn_givenAPartyBusWithAvailableRoom_thenPassengerContainedInPassengersOfBus() {
        // Given
        PartyBus bus = new PartyBus(new Person("Otto Mann"));
        Person expectedPassenger = new Person("Bart Simpson");

        // When
        bus.hopOn(expectedPassenger);

        // Then
        Assertions.assertIterableEquals(bus.getPassengers(), asList(expectedPassenger));
    }

    @Test
    void hopOn_givenAPartyBusWithNoRoomLeft_thenPassengerNotContainedInPassengersOfBus() {
        // Given
        PartyBus bus = new PartyBus(new Person("Otto Mann"));
        List<Person> givenPassengers = new ArrayList<>();
        for (int i = 0; i < PartyBus.MAX_AMOUNT_OF_PASSENGERS; i++) {
            Person passenger = new Person(format("Mr. Generic Passenger %s", i));
            givenPassengers.add(passenger);
            bus.hopOn(passenger);
        }

        // When
        bus.hopOn(new Person("Bart Simpson"));

        // Then
        Assertions.assertIterableEquals(bus.getPassengers(), givenPassengers);
    }

    @Test
    void hopOff_givenAPartyBusContainingThePassenger_thenPassengerNoLongerOnBus() {
        // Given
        PartyBus bus = new PartyBus(new Person("Otto Mann"));
        List<Person> givenPassengers = new ArrayList<>();
        for (int i = 0; i < PartyBus.MAX_AMOUNT_OF_PASSENGERS; i++) {
            Person passenger = new Person(format("Mr. Generic Passenger %s", i));
            givenPassengers.add(passenger);
            bus.hopOn(passenger);
        }
        Person passengerToHopOff = givenPassengers.get(0);

        // When
        bus.hopOff(passengerToHopOff);

        // Then
        Assertions.assertEquals(bus.getPassengers().size(), givenPassengers.size() - 1);
        Assertions.assertFalse(bus.getPassengers().contains(passengerToHopOff));

    }

    @Test
    void hopOff_givenAPartyBusNotContainingThePassenger_thenThrowException() {
        // Given
        PartyBus bus = new PartyBus(new Person("Otto Mann"));
        Person notAPassenger = new Person("Bart Simpson");

        // When
        Executable whenMethod = () -> bus.hopOff(notAPassenger);

        // Then
        Assertions
                .assertThrows(
                        IllegalArgumentException.class,
                        whenMethod,
                        format("A passenger can only hop off the bus if it was already on the bus. Passenger %s was " +
                                "not on the bus.", notAPassenger));
    }

}
