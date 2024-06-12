package code_example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Person, String> dictionary = new HashMap<>();

        Person personTim = new Person("Tim", "Vercruysse");
        dictionary.put(personTim, "ezkjfsklsdfjls");
        Person personKarel = new Person("Karel", "Vanroey");
        dictionary.put(personKarel, "Karel");

        System.out.println(dictionary.get(new Person("Timdfd", "Vercruysererkldpfgksefgmlkdfgmldfgsdmfgljdfgmse")));

//        System.out.println(dictionary.keySet());
//        System.out.println(dictionary.values());
//        System.out.println(dictionary.entrySet());
//
//        for(Entry<String, Person> entry : dictionary.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }
}
