package code_example01.people;

import code_example01.people.behavior.Employable;
import code_example01.people.behavior.Talkable;

import java.time.LocalDate;

public class BusDriver extends Person implements Employable, Talkable{

    public BusDriver(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    public int getSalary() {
        return 2100;
    }

    @Override
    public String saySomething() {
        return "Next stop: Brussels";
    }
}
