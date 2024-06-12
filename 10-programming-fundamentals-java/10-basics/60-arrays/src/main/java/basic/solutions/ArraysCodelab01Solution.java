package basic.solutions;

public class ArraysCodelab01Solution {

    public static void main(String[] args) {
        String[] input = {"1", "2", "3", "4", "5", "6", "7"};
        printOutThirdElement(input);
        printOutFifthElement(input);
    }

    /**
     * Implement this method so that it prints out the 3rd element of the input array
     */
    public static void printOutThirdElement(String[] input) {
        System.out.println(input[2]);
    }

    /**
     * Implement this method so that it prints out the 5th element of the input array
     */
    public static void printOutFifthElement(String[] input) {
        System.out.println(input[4]);
    }
}
