package basic;

import java.util.Arrays;

public class ArraysCodelab05 {

    public static void main(String[] args) {
        String[] words = {"I", "really", "need", "that", "solution"};
        System.out.println(Arrays.toString(replaceThirdWord(words, "nailed")));
    }

    /**
     * Start with a String array and a String replaceWord
     * Replace the element, on index 2 of the array, with replacingWord
     * If the array contains 2 or fewer elements, return the array as is
     * replaceThirdWord(["This", "is", "really", "very", "funny"], "not") → ["This", "is", "not", "very", "funny"]
     * replaceThirdWord(["This", "is", "funny"], "Sparta!") → ["This", "is", "Sparta"]
     * replaceThirdWord(["Not", "Working"], "PewPew") → ["Not", "Working"]
     */
    public static String[] replaceThirdWord(String[] words, String replacingWord) {
        if (words.length <= 2){
            return words;
        }
        else {
            words[2] = replacingWord;
            return words;
        }
    }


}
