package basic.codelab02;

import java.time.LocalTime;
import java.util.Objects;

public class Person {
    private String state;

    public Person(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void bite(Person person, LocalTime time) {
        if (this.state.equals("Vampire") && time.isAfter(LocalTime.of(0,0)) && time.isBefore(LocalTime.of(7,0)) || time.equals(LocalTime.MIDNIGHT)) {
            person.setState("Vampire");
        }
    }
}
