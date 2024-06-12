package advanced.solutions;

import java.util.Arrays;

public class ArraysCodelab02Solution {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 5, 6};
        System.out.println(Arrays.toString(takeMiddleElements(numbers1, numbers2)));
    }

    /**
    * Given 2 int arrays, a and b, each length 3,
     * return a new array length 2 containing their middle elements.
     *      takeMiddleElements([1, 2, 3], [4, 5, 6]) → [2, 5]
     *      takeMiddleElements([7, 7, 7], [3, 8, 0]) → [7, 8]
     *      takeMiddleElements([5, 2, 9], [1, 4, 5]) → [2, 4]
     */
    public static int[] takeMiddleElements(int[] firstNumbers, int[] secondNumbers) {
        return new int[]{firstNumbers[1], secondNumbers[1]};
    }

}
