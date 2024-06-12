package basic.solutions.codelab02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringJoiner;

public class WordReader {

    public static String toText(Collection<String> collection) {
        var text = new StringJoiner("\n");
        for (String word: collection) {
            text.add(word);
        }
        return text.toString();
    }

    public static List<String> toCapitalizedText(Collection<String> collection) {
        List<String> capitalizedWords = new ArrayList<>();
        for (String word: collection) {
            capitalizedWords.add(capitalizeFirstLetter(word));
        }
        return capitalizedWords;
    }

    private static String capitalizeFirstLetter(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

}
