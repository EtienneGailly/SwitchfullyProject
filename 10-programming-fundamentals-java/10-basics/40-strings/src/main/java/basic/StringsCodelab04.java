package basic;

public class StringsCodelab04 {

    public static void main(String[] args) {
        System.out.println(findIndexOfWord("Gello Tello Hello Brello Smello", "Hello"));
    }

    /**
     * Given a String text and a String word to find
     * return the index (position) of the word in the text
     *      e.g.: "This text contains word" and "word" results in 19.
     * If the word does not occur in the text, it's OK to return -1
     * Using the documentation of String, search for the indexOf method, you'll need it.
     */
    public static int findIndexOfWord(String text, String wordToFind) {
        // implement me as described
        int resultIndex = text.indexOf(wordToFind);
        return resultIndex;
    }

}
