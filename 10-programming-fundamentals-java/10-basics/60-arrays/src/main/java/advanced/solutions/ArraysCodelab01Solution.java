package advanced.solutions;

public class ArraysCodelab01Solution {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 6};
        System.out.println(firstOrLast6(numbers1));
        int[] numbers2 = {6, 1, 2, 3};
        System.out.println(firstOrLast6(numbers2));
        int[] numbers3 = {13, 6, 1, 2, 3};
        System.out.println(firstOrLast6(numbers3));
    }

    /**
     * Given an array of ints,
     * return true if 6 appears as either the first or last element in the array.
     * The array will be length 1 or more.
     * firstOrLast6([1, 2, 6]) → true
     * firstOrLast6([6, 1, 2, 3]) → true
     * firstOrLast6([13, 6, 1, 2, 3]) → false
     */
    public static boolean firstOrLast6(int[] numbers) {
        return numbers[0] == 6 || numbers[numbers.length - 1] == 6;
    }

}
