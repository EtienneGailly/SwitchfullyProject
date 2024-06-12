package advanced.solutions;

public class LoopsCodelabs03Solution {

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
        boolean balenced = true;
        for (int i = 0; i < textToAnalyze.length(); i++) {
            if (textToAnalyze.charAt(i) == 'x') {
                balenced = false;
            }
            if (textToAnalyze.charAt(i) == 'y') {
                balenced = true;
            }
        }
        return balenced;
    }

//    public static boolean xyBalance(String textToAnalyze) {
//        //        return textToAnalyze.lastIndexOf("x") <= textToAnalyze.lastIndexOf("y");
//        boolean balanced = true;
//        for (int character : textToAnalyze.chars().toArray()) {
//            if (character == 'x') {
//                balanced = false;
//            }
//            if(character == 'y'){
//                balanced = true;
//            }
//        }
//        return balanced;
//    }


}
