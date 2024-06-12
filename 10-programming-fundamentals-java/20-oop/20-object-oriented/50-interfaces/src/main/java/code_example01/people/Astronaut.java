package code_example01.people;

import code_example01.people.behavior.Employable;
import code_example01.people.behavior.Talkable;

import java.time.LocalDate;

public class Astronaut extends Person implements Employable, Talkable {

    public Astronaut(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    public int getSalary() {
        return 3500;
    }

    @Override
    public String saySomething() {
        return "Houston, we have a problem";
    }
}
