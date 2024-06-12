package code_example01.people;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("Hello, I'm %s %s and I'm %s years old", firstName, lastName, Period.between(birthDate, LocalDate.now()).getYears());
    }
}
