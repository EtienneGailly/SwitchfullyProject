package basic.solutions;


public class StringsCodelab06Solution {

    public static void main(String[] args) {
        System.out.println(doubleText("Kokoro"));
        System.out.println(isCorrectlyDoubled("Kokoro", doubleText("Kokoro")));
        System.out.println(isCorrectlyDoubled("Kokoro", "KokoroKokoro"));
    }

    public static String doubleText(String text) {
        return text.concat(text);
    }

    public static boolean isCorrectlyDoubled(String originalText, String doubledText) {
        return doubledText.equals(originalText.concat(originalText));
    }

}
