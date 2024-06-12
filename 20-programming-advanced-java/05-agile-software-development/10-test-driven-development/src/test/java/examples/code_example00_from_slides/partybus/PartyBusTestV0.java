package examples.code_example00_from_slides.partybus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * A Test class demonstrating how NOT to write tests
 */
class PartyBusTestV0 {

    @Test
    void hopOn1() {
        Person p = new Person("Bart Simpson");
        PartyBus pb = new PartyBus(new Person("Otto Mann"));
        pb.hopOn(p);
        Assertions.assertEquals(pb.getPassengers().get(0), p);
    }

    @Test
    void hopOn2() {
        PartyBus b1 = new PartyBus(new Person("Otto Mann"));
        List<Person> givenPassengers = new ArrayList<>();
        for (int i = 0; i < PartyBus.MAX_AMOUNT_OF_PASSENGERS; i++) {
            Person passenger = new Person(format("Mr. Generic Passenger %s", i));
            givenPassengers.add(passenger);
            b1.hopOn(passenger);
        }
        b1.hopOn(new Person("Bart Simpson"));
        Assertions.assertEquals(b1.getPassengers().get(0), givenPassengers.get(0));
        Assertions.assertEquals(b1.getPassengers().get(1), givenPassengers.get(1));
        Assertions.assertEquals(b1.getPassengers().get(2), givenPassengers.get(2));
        Assertions.assertEquals(b1.getPassengers().get(3), givenPassengers.get(3));
        Assertions.assertEquals(b1.getPassengers().get(4), givenPassengers.get(4));
    }

    @Test
    void hopOff1() {
        PartyBus bus = new PartyBus(new Person("Otto Mann"));
        List<Person> pp = new ArrayList<>();
        for (int i = 0; i < PartyBus.MAX_AMOUNT_OF_PASSENGERS; i++) {
            Person p2 = new Person(format("Mr. Generic Passenger %s", i));
            pp.add(p2);
            bus.hopOn(p2);
        }
        Person passengerToHopOff = pp.get(0);
        bus.hopOff(passengerToHopOff);
        Assertions.assertEquals(bus.getPassengers().size(), pp.size() - 1);
        Assertions.assertFalse(bus.getPassengers().contains(passengerToHopOff));

    }

    @Test
    void hopOff2() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new PartyBus(new Person("Otto Mann")).hopOff(new Person("Bart Simpson")));
    }

}
