package basic.solutions;

/**
 * Return a String containing x times (numberOfTimes) the provided String (textToRepeat)
 * numberOfTimes should be a positive number, if not, return text "Impossible text repeat"
 * textRepeatWhile(2, "M") → "MM"
 * textRepeatWhile(5, "Pew") → "PewPewPewPewPew"
 * textRepeatWhile(0, "Hello") → ""
 * textRepeatWhile(-1, "Non") → "Impossible text repeat"
 * In total, you'll have to implement this for 3 different methods,
 * each time using a different loop mechanism.
 */
public class LoopsCodelabs07Solution {

    /**
     * For this method, only use the WHILE-LOOP
     */
    public static String textRepeatWhile(int numberOfTimes, String textToRepeat) {
        if (numberOfTimes < 0) {
            return "Impossible text repeat";
        }

        String result = "";
        while (numberOfTimes > 0) {
            result += textToRepeat;
            numberOfTimes--;
        }
        return result;
    }

    /**
     * For this method, only use the DO-WHILE-LOOP
     */
    public static String textRepeatDoWhile(int numberOfTimes, String textToRepeat) {
        if (numberOfTimes < 0) {
            return "Impossible text repeat";
        }
        if (numberOfTimes == 0) {
            return "";
        }

        String result = "";
        do {
            result += textToRepeat;
            numberOfTimes--;
        } while (numberOfTimes > 0);

        return result;
    }

    /**
     * For this method, only use the FOR-LOOP
     */
    public static String textRepeatFor(int numberOfTimes, String textToRepeat) {
        if (numberOfTimes < 0) {
            return "Impossible text repeat";
        }

        String result = "";
        for (int i = numberOfTimes; i > 0; i--) {
            result += textToRepeat;
        }
        return result;
    }

}
