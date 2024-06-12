package basic.solutions.codelab02;

import java.util.Scanner;

public class Main {

    private final static Person[] persons = new Person[]{
            new Person("Saskia", "Declerq", new Address("Rue de l'hopital", "9", "4123", "Charleroi", "Belgium")),
            new Person("Peter", "Weter", null),
            new Person(null, "Vervaeke", new Address("Kerkstraat", "12", "1200", "Elsene", "Belgium")),
            new Person("Louise", null, null)
    };

    /**
     * This code is really flaky (easily breaks), because it's not checking for nulls.
     * Can you find the 4 different null checks that are missing?
     *
     * Add guard clauses to this code so that it no longer throws NullPointerExceptions.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a person: ");
        String selectedName = scanner.nextLine();
        System.out.print("Choose a text (one line): ");
        String text = scanner.nextLine();

        Person person = getPerson(selectedName);
        sendLetter(person, text);
    }

    public static void sendLetter(Person person, String text) {
        if(person == null) {
            System.out.println("Can not send letter. Person doesn't exist");
            return;
        }
        if(person.getAddress() == null) {
            System.out.println("Can not send letter. Person doesn't have an address");
            return;
        }
        System.out.println("Sending letter to: " + person.getFirstName() + " " + person.getLastName());
        System.out.println();
        System.out.println("To be printed on enveloppe: ");
        System.out.println(person.getFirstName() + " " + person.getLastName());
        System.out.println(person.getStreet() + " " + person.getHouseNumber());
        System.out.println(person.getZipCode() + " " + person.getCity());
        System.out.println(person.getCountry());
        System.out.println();
        System.out.println("To be printed on the letter: ");
        System.out.println(text);
    }

    public static Person getPerson(String selectedName) {
        for (Person person : persons) {
            if ((person.getFirstName() != null && person.getFirstName().equals(selectedName)) ||
                    (person.getLastName() != null && person.getLastName().equals(selectedName))) {
                return person;
            }
        }
        return null;
    }
}
