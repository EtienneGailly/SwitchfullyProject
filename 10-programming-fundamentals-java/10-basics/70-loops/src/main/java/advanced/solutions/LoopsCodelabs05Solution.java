package advanced.solutions;

public class LoopsCodelabs05Solution {

    /**
     * Given an array length of ints,
     * return the difference between the largest and smallest values in the array.
     * If the array contains less than 2 elements, return 0
     *      minMaxDifference([10, 3, 5, 6]) → 7
     *      minMaxDifference([7, 2, 10, 9]) → 8
     *      minMaxDifference([2, 10, 7, 2]) → 8
     * Tip: go take a look at the Math.min and .max methods.
     */
    public static int minMaxDifference(int[] numbers) {
        if(numbers.length < 2){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int number: numbers) {
            min = Math.min(min, number);
        }

        int max = Integer.MIN_VALUE;
        for (int number: numbers) {
            max = Math.max(max, number);
        }

        return max - min;
    }
}
