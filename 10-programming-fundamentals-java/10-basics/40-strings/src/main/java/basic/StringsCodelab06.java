package basic;

public class StringsCodelab06 {

    public static void main(String[] args) {
        System.out.println(doubleText("Kokoro"));
        System.out.println(isCorrectlyDoubled("Kokoro", doubleText("Kokoro")));
        System.out.println(isCorrectlyDoubled("Kokoro", "KokoroKokoro"));
        System.out.println(isCorrectlyDoubled("Kokoro", "Kokoro"));
    }

    /**
     * Given a String text,
     * return the text as doubled
     *      e.g.: "Hello", should return "HelloHello"
     */
    public static String doubleText(String text) {
        // implement me as described
        return text+text;
    }

    /**
     * Given a String originalText and String doubledText
     * return true if the doubledText is equal to the originalText being doubled
     *      e.g.: "Hello" (originalText) and "HelloHello" (doubledText) should return true
     *      e.g.: "Hell" (originalText) and "HellHello" (doubledText) should return false
     *      e.g.: "Hello" (originalText) and "Hello" (doubledText) should return false
     */
    public static boolean isCorrectlyDoubled(String originalText, String doubledText) {
        // implement me as described
        return  doubledText.equals(originalText+originalText);
    }

}
