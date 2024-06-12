package basic.codelab01;

import java.util.StringJoiner;

/**
 * Read the README.md file.
 */
public class SoundService {

    public static void main(String[] args) {
        Baby[] babies = {new Baby(), new Baby()};
        Computer[] computers = {new Computer()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        Cat[] cats = {new Cat()};
        System.out.println(allMakeSound(babies));
        System.out.println(allMakeSound(computers));
        System.out.println(allMakeSound(dogs));
        System.out.println(allMakeSound(cats));
    }

    static String allMakeSound(Baby[] babies) {
        StringJoiner joiner = new StringJoiner("\n");
        for(Baby baby : babies) {
            joiner.add(baby.makeSound());
        }
        return joiner.toString();
    }

    static String allMakeSound(Computer[] computers) {
        StringJoiner joiner = new StringJoiner("\n");
        for(Computer computer : computers) {
            joiner.add(computer.makeSound());
        }
        return joiner.toString();
    }

    static String allMakeSound(Dog[] dogs) {
        StringJoiner joiner = new StringJoiner("\n");
        for(Dog dog : dogs) {
            joiner.add(dog.makeSound());
        }
        return joiner.toString();
    }

    static String allMakeSound(Cat[] cats) {
        StringJoiner joiner = new StringJoiner("\n");
        for(Cat cat : cats) {
            joiner.add(cat.makeSound());
        }
        return joiner.toString();
    }

}
