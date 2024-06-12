package basic.solutions;

public class LoopsCodelabs05Solution {

    /**
     * Create a method that will return that contains all the numbers from 1 to n.
     * With n being the argument.
     * If n is smaller than one return an empty array
     * E.g. createRange(10) will return {1,2,3,4,5,6,7,8,9,10}
     */
    public static int[] createRange(int range) {
        if(range < 0) return new int[0];

        int[] result = new int[range];
        for (int index = 0; index < range; index++) {
            result[index] = index + 1;
        }
        return result;
    }
}
