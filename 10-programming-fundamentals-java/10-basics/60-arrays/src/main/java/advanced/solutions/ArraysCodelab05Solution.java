package advanced.solutions;

import java.util.Arrays;

public class ArraysCodelab05Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapElements(1, 2, new String[]{"Bart", "Bob", "Mark", "Mike", "Charlie", "Kurt"})));
        System.out.println(Arrays.toString(replaceElementAtIndexWith(1, "replacement", new String[]{"Bart", "Bob", "Mark", "Mike", "Charlie", "Kurt"})));
    }

    /**
     * 1. Implement this method so that the element at index in array will be replaced by replacement
     * 2. If index is either too big or too small do nothing
     */
    public static String[] replaceElementAtIndexWith(int index, String replacement, String[] array) {
        if(index < 0 || index >= array.length) {
            return array;
        }
        array[index] = replacement;
        return array;
    }

    /**
     * Implement this method so that it switches the element at index1 with the element at index2
     * If either index1 or index2 is too small or too big do nothing
     * <p>
     * Visual example:
     * Say you have the following array [12, 24, 36, 48, 60] and you want to replace the 3rd element with the 5th.
     * <p>
     * In the memory this will look like this:
     * memory address      value in memory
     * XX0                     12 <- pointer to start of array
     * XX1                     24
     * XX2                     36 <- 3rd element in the array needs to be replaced with the 5th element (60)
     * XX3                     48
     * XX4                     60 <- 5th element in the array needs to be replaced with the 3rd element (36)
     * <p>
     * Hint!
     * If your stuck, try to first replace the element at index1 with the element at index2 but not vice-versa (so only the element at index1 changes and the element at index2 stays the same).
     * <p>
     * If you made this work, then try to find a way to temporary save the element at index1 before you overwrite it with the element at index 2.
     * Use this saved value to overwrite the element at index2.
     */
    public static String[] swapElements(int index1, int index2, String[] array) {
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            return array;
        }

        String element1 = array[index1];
        array[index1] = array[index2];
        array[index2] = element1;
        return array;
    }
}
