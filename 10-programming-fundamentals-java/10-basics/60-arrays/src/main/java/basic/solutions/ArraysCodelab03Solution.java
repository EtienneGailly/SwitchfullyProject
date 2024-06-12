package basic.solutions;

public class ArraysCodelab03Solution {

    public static void main(String[] args) {
        System.out.println(getSize(new int[]{1, 2, 3, 4}));
        System.out.println(getElementAt(1, new int[]{1, 2, 3, 4, 5}));
        System.out.println(getElementAtRealIndex(1, new int[]{1, 2, 3, 4, 5}));
        System.out.println(getElementAtSumOfIndexes(2, 3, new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    /**
     * Implement this method so that it returns the size of the given array.
     */
    public static int getSize(int[] input) {
        return input.length;
    }

    /**
     * 1. Implement this method so that it returns the element at place index in the array.
     *
     * <p>
     * As always, try to think of all the different ways that this program might break due to wrong input.
     * Provide guard clauses that return something appropriate.
     */
    public static int getElementAt(int index, int[] array) {
        if(index < 0 || index >= array.length) {
            return 0;
        }
        return array[index];
    }


    /**
     * Indexes in arrays can be confusing, since we start counting from 0.
     * Implement the previous method again but make it so that we start counting from 1 instead of 0.
     * <p>
     * (So if you get the element at index 1, you'll get the first element in the array.)
     * <p>
     * Think of the edge-cases and write guard clauses to handle them.
     */
    public static int getElementAtRealIndex(int index, int[] array) {
        if (index == 0 || index -1 >= array.length) {
            return 0;
        }
        return array[index - 1];
    }

    /**
     * You can also use expressions to access an element of an array. So the expression "array[1 + 1]" will return the element at index 2.
     * <p>
     * Apply this by implementing the following method so that it uses the expression "index1 + index2" to access the array element
     *
     * <p>
     * Think of the edge-cases and write guard clauses to handle them.
     */
    public static int getElementAtSumOfIndexes(int index1, int index2, int[] array) {
        if (index1 + index2 < 0 || index1 + index2 >= array.length) {
            return 0;
        }
        return array[index1 + index2];
    }

}
