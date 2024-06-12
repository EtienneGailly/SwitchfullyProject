package code_example01.people;

import code_example01.people.behavior.Talkable;

import java.time.LocalDate;

public class Baby extends Person implements Talkable{

    public Baby(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    public String saySomething() {
        return "Gaga...";
    }
}
