package code_example01;

import code_example01.people.Astronaut;
import code_example01.people.Baby;
import code_example01.people.BusDriver;
import code_example01.people.Person;
import code_example01.people.behavior.Employable;
import code_example01.people.behavior.Talkable;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        Person[] persons = {
          new Baby("Gunter", "Delieux", LocalDate.of(2018, 1, 20)),
          new Astronaut("Heil", "Narmstrong", LocalDate.of(1935, 6, 20)),
          new BusDriver("Bill", "Billians", LocalDate.of(1968, 7, 15)),
          new BusDriver("Zans", "Himmer", LocalDate.of(1979, 2, 25))
        };

        System.out.println("Persons:");
        for(Person person : persons) {
            System.out.println(String.format("\t%s", person.toString()));
        }

        Employable[] employees = {
                new Astronaut("Heil", "Narmstrong", LocalDate.of(1935, 6, 20)),
                new BusDriver("Zans", "Himmer", LocalDate.of(1979, 2, 25))
        };

        System.out.println("Employees (Salary):");
        for(Employable employee : employees) {
            System.out.println(String.format("\t€%s", employee.getSalary()));
        }

        Talkable[] talkables = {
                new Baby("Gunter", "Delieux", LocalDate.of(2018, 1, 20)),
                new Astronaut("Heil", "Narmstrong", LocalDate.of(1935, 6, 20)),
                new BusDriver("Bill", "Billians", LocalDate.of(1968, 7, 15)),
        };

        System.out.println("Talkables:");
        for(Talkable talkable: talkables) {
            System.out.println(String.format("\tSaying something: %s", talkable.saySomething()));
        }
    }

}
