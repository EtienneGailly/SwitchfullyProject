package basic.codelab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3 different ways for creating a list with elements added.
 * You don't need to change anything in this class.
 */
public class NameGenerator {


    static List<String> generateFunnyNames() {
        List<String> funnyNames = new ArrayList<>();
        funnyNames.add("Timmiolala");
        funnyNames.add("Kevivio");
        funnyNames.add("Annananana");
        return funnyNames;
    }

    static List<String> generateNormalNames() {
        return List.of(
                "Jim",
                "Tom",
                "Ann"
        );
    }

    static List<String> generateSeriousNames() {
        return Arrays.asList(
                "James",
                "Boris",
                "Claire"
        );
    }



}
