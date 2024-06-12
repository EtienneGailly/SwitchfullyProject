package advanced.solutions;

public class LoopsCodelabs06Solution {

    /**
     * Given an array of scores,
     * return true if each score is equal or greater than the one before.
     * If the array has a length less than 2,
     *      throw an Illegal Argument Exception with message "The scores argument needs to have at least 2 elements"
     *      areScoresAscending([1, 3, 4]) → true
     *      areScoresAscending([1, 3, 2]) → false
     *      areScoresAscending([1, 1, 4, 5]) → true
     *      areScoresAscending([1, 1]) → true
     *      areScoresAscending([1]) → Illegal Argument Exception
     */
    public static boolean areScoresAscending(int[] scores) {
        if(scores.length < 2){
            throw new IllegalArgumentException("The scores argument needs to have at least 2 elements");
        }
        int previousScore = scores[0];
        for (int score : scores) {
            if(score < previousScore) {
                return false;
            }
            previousScore = score;
        }
        return true;
    }

}
