package advanced;

import java.util.Arrays;

public class LoopsCodelabs04 {

    /**
     * Given a array of ints,
     * return a new array containing the elements from the original array that come after the last number 4 in the original array.
     * The original array will contain at least one number 4,
     *      if not: return a new array containing only the element 4.
     * If an empty array is provided
     *      return a new array containing one element, 4.
     * Examples:
     *      getElementsAfter4([2, 4, 1, 2]) → [1, 2]
     *      getElementsAfter4([4, 1, 4, 2]) → [2]
     *      getElementsAfter4([4, 4, 1, 2, 3]) → [1, 2, 3]
     *      getElementsAfter4([2, 1, 1, 2]) → [4]
     *      getElementsAfter4([]) → [4]
     */
    public static int[] getElementsAfter4(int[] numbers) {
        if (!checkIf4Present(numbers) || numbers.length == 0){
            return new int[]{4};
        }
        int last4Index = getLast4Index(numbers);
        int resultSize = numbers.length-last4Index-1;
        int[] result = new int[resultSize];
        for (int i = 0; i < resultSize; i++){
            result[i] = numbers[last4Index+i+1];
        }
        return result;
    }

    public static boolean checkIf4Present(int[] numbers) {
        for (int number : numbers) {
            if (number == 4) {
                return true;
            }
        }
        return false;
    }

    public static int getLast4Index(int[] numbers) {
        int index = numbers.length-1;
        while (numbers[index] != 4) {
            index--;
        }
        return index;
    }

}
