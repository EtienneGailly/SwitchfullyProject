package basic.solutions.codelab01;

import java.util.StringJoiner;

/**
 * Read the README.md file.
 */
public class SoundService {

    public static void main(String[] args) {
        SoundMaker[] soundMakers = {
                new Baby(),
                new Baby(),
                new Computer(),
                new Dog(),
                new Dog(),
                new Dog(),
                new Cat(),
                new Piano()
        };
        System.out.println(allMakeSound(soundMakers));
    }

    static String allMakeSound(SoundMaker[] soundMakers) {
        StringJoiner joiner = new StringJoiner("\n");
        for (SoundMaker soundMaker : soundMakers) {
            joiner.add(soundMaker.makeSound());
        }
        return joiner.toString();
    }
}
