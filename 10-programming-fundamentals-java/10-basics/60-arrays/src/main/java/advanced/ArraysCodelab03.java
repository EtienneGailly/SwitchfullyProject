package advanced;

import java.util.Arrays;

public class ArraysCodelab03 {

    public static void main(String[] args) {
        int[] numbers1 = {1, 3};
        int[] numbers2 = {4, 6};
        System.out.println(Arrays.toString(concatArrays(numbers1, numbers2)));
    }

    /**
     * Given 2 int arrays, a and b
     * Check if both arrays have length 2, if not, return a.
     * If a and b have length 2, return a new array length 4 containing all their elements.
     *      concatArrays([1, 2], [3, 4]) → [1, 2, 3, 4]
     *      concatArrays([4, 4], [2, 2]) → [4, 4, 2, 2]
     *      concatArrays([9, 2], [3, 4]) → [9, 2, 3, 4]
     */
    public static int[] concatArrays(int[] firstNumbers, int[] secondNumbers) {
        //throw new UnsupportedOperationException("implement me");
        if (!(firstNumbers.length == 2 && secondNumbers.length == 2)){
            return firstNumbers;
        }
        else {
            return new int[]{firstNumbers[0],firstNumbers[1],secondNumbers[0],secondNumbers[1]};
        }
    }

}
