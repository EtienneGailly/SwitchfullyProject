package advanced.solutions;

public class LoopsCodelabs02Solution {

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string. If the string is empty, return false.
     *      catDog("catdog") → true
     *      catDog("catcat") → false
     *      catDog("1cat1cadodog") → true
     *      catDog("") → false
     * Tip: "cat" and "dog" both have length 3...
     */
    public static boolean catDog(String textToAnalyze) {
        if (textToAnalyze.isEmpty()) {
            return false;
        }

        int numberOfCats = 0;
        int numberOfDogs = 0;
        for (int i = 0; i <= textToAnalyze.length() - 3; i++) {
            String substring = textToAnalyze.substring(i, i + 3);

            if (substring.equals("dog")) {
                numberOfDogs++;
            }
            if (substring.equals("cat")) {
                numberOfCats++;
            }
        }
        return numberOfCats == numberOfDogs;
    }

}
