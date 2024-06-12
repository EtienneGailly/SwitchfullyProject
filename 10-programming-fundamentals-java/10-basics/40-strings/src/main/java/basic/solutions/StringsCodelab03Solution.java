package basic.solutions;


public class StringsCodelab03Solution {

    public static void main(String[] args) {
        System.out.println(wrapWord("<<>>", "wrapped inside"));
        System.out.println(wrapWord("xxxx", "oOo"));
    }

    public static String wrapWord(String wrapper, String wordToBeWrapped) {
        int wrapperMiddleIndex = wrapper.length() / 2;
        return wrapper.substring(0, wrapperMiddleIndex)
                + wordToBeWrapped
                + wrapper.substring(wrapperMiddleIndex, wrapper.length());
    }

}
