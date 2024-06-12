package advanced;

public class LoopsCodelabs02 {

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string. If the string is empty, return false.
     *      catDog("catdog") → true
     *      catDog("catcat") → false
     *      catDog("1cat1cadodog") → true
     *      catDog("") → false
     * Tip: "cat" and "dog" both have length 3...
     */
    public static boolean catDog(String textToAnalyze) {
        int numberOfCats = 0;
        int numberOfDogs = 0;
        if (textToAnalyze.isEmpty()){
            return false;
        }
        for (int i = 0; i < textToAnalyze.length()-2; i++) {
            if (textToAnalyze.substring(i, i + 3).equals("cat")) {
                numberOfCats++;
            }
            if (textToAnalyze.substring(i, i + 3).equals("dog")) {
                numberOfDogs++;
            }
        }
        return (numberOfCats == numberOfDogs);
    }

}
