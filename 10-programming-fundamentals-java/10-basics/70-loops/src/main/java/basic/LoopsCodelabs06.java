package basic;

public class LoopsCodelabs06 {

    /**
     * Create a merge function that merges two arrays into one.
     * The merge function must mix the elements like a zipper
     * E.G. merge({1,2,3}{1,2,3}) -> {1,1,2,2,3,3}
     * <p>
     * If both arrays are of a different length return an empty array
     */
    public static int[] merge(int[] array1, int[] array2) {
       if (array1.length != array2.length) {
           return new int[0];
       }
       else {
           int[] result = new int[2 * array1.length];
           for (int i = 0; i < array1.length; i++) {
               result[2*i] = array1[i];
               result[(2*i)+1] = array2[i];
           }
           return result;
       }
    }
}
