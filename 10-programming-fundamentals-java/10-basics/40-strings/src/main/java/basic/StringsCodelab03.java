package basic;

public class StringsCodelab03 {

    public static void main(String[] args) {
        System.out.println(wrapWord("<<>>", "wrapped inside"));
        System.out.println(wrapWord("----", "oOo"));
        System.out.println(wrapWord("<[x<>y]>", "poco loco"));
    }

    /**
     * A modification on the last lab!
     * Given a wrapper String with a variable but even length, such as "<[x<>y]>", and a word,
     * return a new string where the word is in the middle of the wrapped string,
     *      e.g.: "<[x<>y]>" and "test" results in "<[x<test>y]>".
     * Using the documentation of String, search for the substring method, you'll need it.
     */
    public static String wrapWord(String wrapper, String wordToBeWrapped) {
        // implement me as described
        int wrapperLength=wrapper.length();
        return wrapper.substring(0,wrapperLength/2) + wordToBeWrapped + wrapper.substring(wrapperLength/2,wrapperLength);
    }

}
