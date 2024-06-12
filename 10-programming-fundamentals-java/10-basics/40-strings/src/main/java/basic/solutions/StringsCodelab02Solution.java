package basic.solutions;


public class StringsCodelab02Solution {

    public static void main(String[] args) {
        System.out.println(wrapWord("<<>>", "wrapped inside"));
        System.out.println(wrapWord("xxxx", "oOo"));
    }

    public static String wrapWord(String wrapper, String wordToBeWrapped) {
        return wrapper.substring(0, 2) + wordToBeWrapped + wrapper.substring(2, 4);
    }

}
