package advanced.solutions;

public class LoopsCodelabs08Solution {

    /**
     * Given two arrays of ints sorted in increasing order, outer and inner,
     * return true if all of the numbers in inner appear in outer.
     * The best solution makes only a single "linear" pass of both arrays,
     * taking advantage of the fact that both arrays are already in sorted order.
     * Check the tests to see which edge cases exist and how you should respond to them!
     *      linearIn([1, 2, 4, 6], [2, 4]) → true
     *      linearIn([1, 2, 4, 6], [2, 3, 4]) → false
     *      linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     *      linearIn([1, 2, 8, 800, 1050], [1, 800]) → true
     */
    public static boolean doesOuterContainAllElementsOfInner(int[] outer, int[] inner) {
        if(outer.length < inner.length) {
            throw new IllegalArgumentException("Inner cannot be bigger than outer");
        }

        int index = 0;
        for (int in: inner) {
            boolean found = false;
            for(; index < outer.length; index++){
                if(outer[index] == in){
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }

//    public static boolean doesOuterContainAllElementsOfInner(int[] outer, int[] inner) {
//        if (outer.length < inner.length) throw new IllegalArgumentException("Inner cannot be bigger than outer");
//
//        for (int in : inner) {
//            if(!canBeFoundIn(outer, in)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean canBeFoundIn(int[] outer, int in) {
//        for(int out : outer){
//            if(out == in){
//                return true;
//            }
//        }
//        return false;
//    }

}
