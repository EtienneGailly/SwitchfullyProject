package basic.solutions;

public class LoopsCodelabs06Solution {

    /**
     * Create a merge function that merges two arrays into one.
     * The merge function must mix the elements like a zipper
     * E.G. merge({1,2,3}{1,2,3}) -> {1,1,2,2,3,3}
     * <p>
     * If both arrays are of a different length return an empty array
     */
    public static int[] merge(int[] array1, int[] array2) {
        if(array1.length != array2.length) return new int[]{};

        int[] result = new int[array1.length * 2];

        for (int index = 0; index < result.length; index += 2) {
            result[index] = array1[index / 2];
            result[index + 1] = array2[index / 2];
        }
        return result;
    }
}
