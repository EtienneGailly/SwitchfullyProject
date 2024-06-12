package basic;

public class StringsCodelab02 {

    public static void main(String[] args) {
        System.out.println(wrapWord("<<>>", "wrapped inside"));
        System.out.println(wrapWord("xxxx", "oOo"));
    }

    /**
     * Given a wrapper String with a fixed-length of 4, such as "<<>>", and a word,
     * return a new string where the word is in the middle of the wrapped string,
     *      e.g.: "<<>>" and "test" results in "<<test>>".
     * Using the documentation of String, search for the substring method, you'll need it.
     */
    public static String wrapWord(String wrapper, String wordToBeWrapped) {
        // implement me as described
        return wrapper.substring(0,2) + wordToBeWrapped + wrapper.substring(2,4);
    }

}
