package advanced.solutions;

public class LoopsCodelabs02Solution2 {

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string. If the string is empty, return false.
     *      catDog("catdog") → true
     *      catDog("catcat") → false
     *      catDog("1cat1cadodog") → true
     *      catDog("") → false
     * Tip: "cat" and "dog" both have length 3...
     */
    public static boolean catDog(String textToAnalyze) {
        if(textToAnalyze.isEmpty()) return false;

        String[] result = splitStringIntoGroupsOfThree(textToAnalyze);
        int numberOfCats = countNumberOfTimesElementOccurs(result, "cat");
        int numberOfDogs = countNumberOfTimesElementOccurs(result, "dog");

        return numberOfCats == numberOfDogs;
    }

    private static int countNumberOfTimesElementOccurs(String[] array, String element) {
        int result = 0;
        for(String arrayElement: array){
            if(arrayElement.equals(element)){
                result ++;
            }
        }
        return result;
    }

    /**
     * Will convert a String into an array of Strings of length 3.
     * E.G. "abcdefg" ->  {"abc","bcd","cde","def","efg"}
     */
    private static String[] splitStringIntoGroupsOfThree(String textToAnalyze) {
        String[] result = new String[textToAnalyze.length() - 2];
        for(int index = 0; index < textToAnalyze.length() - 2; index++) {
            result[index] = textToAnalyze.substring(index, index + 3);
        }
        return result;
    }

}
