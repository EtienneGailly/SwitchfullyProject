package advanced;

public class LoopsCodelabs03 {

    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
     * there exists a 'y' char somewhere later in the string.
     * So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
     * Return true if the given string is xy-balanced.
     * Attention: if the given String is empty, it is xy-balanced!
     *      xyBalance("aaxbby") → true
     *      xyBalance("aaxbb") → false
     *      xyBalance("yaaxbb") → false
     *      xyBalance("") → true
     */
    public static boolean xyBalance(String textToAnalyze) {
        if (textToAnalyze.equals("")) {
            return true;
        }
        for (int i = 0; i < textToAnalyze.length(); i++) {
            char currentLetter = textToAnalyze.charAt(textToAnalyze.length() - 1 - i);
            if (currentLetter == 'x'){
                return false;
            }
            else if (currentLetter == 'y'){
                return true;
            }
        }
        return true;
    }

}
