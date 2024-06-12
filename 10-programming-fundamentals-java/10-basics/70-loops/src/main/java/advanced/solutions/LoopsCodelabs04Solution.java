package advanced.solutions;

public class LoopsCodelabs04Solution {

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
        int lastIndexOf4 = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                lastIndexOf4 = i;
            }
        }

        if(lastIndexOf4 == -1){
            return new int[]{4};
        }

        int startingIndexResult = lastIndexOf4 + 1;
        int[] result = new int[numbers.length - startingIndexResult];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[startingIndexResult + i];
        }
        return result;
    }

}
