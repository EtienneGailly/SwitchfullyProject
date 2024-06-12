package basic.solutions;

import java.util.Arrays;

public class ArraysCodelab02Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(createArray())));
    }

    /**
     * Complete this method so that it creates an empty int array of length 10
     */
    public static int[] createArray() {
        return new int[10];
    }

    /**
     * Complete this method so that it fills the given array with the numbers 1 to 10
     */
    public static int[] fillArray(int[] array) {
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        return array;
    }

    /**
     * Use the '{}' operator to create and immediately initialize an array with the strings "a" until "k"
     */
    public static String[] createAndFillArray() {
        return new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
    }
}
