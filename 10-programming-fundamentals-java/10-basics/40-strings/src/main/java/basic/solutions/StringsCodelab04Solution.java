package basic.solutions;


public class StringsCodelab04Solution {

    public static void main(String[] args) {
        System.out.println(findIndexOfWord("Gello Tello Hello Brello Smello", "Hello"));
    }

    public static int findIndexOfWord(String text, String wordToFind) {
        return text.indexOf(wordToFind);
    }

}
