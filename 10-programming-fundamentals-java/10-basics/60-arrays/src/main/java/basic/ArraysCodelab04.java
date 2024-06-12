package basic;

public class ArraysCodelab04 {

    public static void main(String[] args) {
        System.out.println(firstElement(new int[]{5, 8, 6, 7, 5}));
        System.out.println(sumOfFirstAndSecondElement(new int[]{5, 8, 6, 7, 5}));
        System.out.println(elementAtIndex(5, new int[]{5, 8, 6, 7, 5, 9}));
        System.out.println(sumOfElementAtIndexAndNextElement(4, new int[]{5, 8, 6, 7, 5, 9}));
    }

    /**
     * Implement this method so that it returns the first element of the given array
     */
    public static int firstElement(int[] array) {
        if (array.length == 0){
            return 0;
        }
        else {
            return array[0];
        }
    }

    /**
     * Implement this method so that it returns the sum of the first and second element of the given array
     */
    public static int sumOfFirstAndSecondElement(int[] array) {
        if (array.length == 0){
            return 0;
        }
        else if (array.length == 1){
            return 0;
        }
        else{
            return array[0]+array[1];
        }
    }

    /**
     * 1. Implement this method so that it returns the element at place index
     */
    public static int elementAtIndex(int index, int[] array) {
        if (index < 0 || index >= array.length){
            return 0;
        }
        else{
            return array[index];
        }
    }

    /**
     * 1. Implement this method so that it returns the sum of the element at place index and the element in the place next to index
     */
    public static int sumOfElementAtIndexAndNextElement(int index, int[] array) {
        if (array.length == 0){
            return 0;
        }
        else if (array.length == 1){
            return array[0];
        }
        else if (index < 0 || index >= array.length - 1){
            return 0;
        }
        else{
            return array[index] + array[index + 1];
        }
    }
}
