package advanced;

public class LoopsCodelabs08 {

    /**
     * Given two arrays of ints sorted in increasing order, outer and inner,
     * return true if all of the numbers in inner appear in outer.
     * The best solution makes only a single "linear" pass of both arrays,
     * taking advantage of the fact that both arrays are already in sorted order.
     * Check the tests to see which edge cases exist and how you should respond to them!
     *      doesOuterContainAllElementsOfInner([1, 2, 4, 6], [2, 4]) → true
     *      doesOuterContainAllElementsOfInner([1, 2, 4, 6], [2, 3, 4]) → false
     *      doesOuterContainAllElementsOfInner([1, 2, 4, 4, 6], [2, 4]) → true
     *      doesOuterContainAllElementsOfInner([1, 2, 8, 800, 1050], [1, 800]) → true
     */
    public static boolean doesOuterContainAllElementsOfInner(int[] outer, int[] inner) {
        //throw new UnsupportedOperationException("Implement me");
        int outerLength = outer.length;
        int innerLength = inner.length;
        if(outerLength < innerLength) {
            throw new IllegalArgumentException("Inner cannot be bigger than outer");
        }
        int j = 0;
        for (int i : inner) {
            boolean intFound = false;
            for (; j < outerLength; j++) {
                if (i == outer[j]) {
                    intFound = true;
                    break;
                }
            }
            if (!intFound){
                return false;
            }
        }
        return true;
    }

}
