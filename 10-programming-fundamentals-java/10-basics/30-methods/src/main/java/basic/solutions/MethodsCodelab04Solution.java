package basic.solutions;

public class MethodsCodelab04Solution {

    public static void main(String[] args) {
        // Call the methods below to produce the following output in the console:
        //      12345
        // Call every method exactly once (no more, no less)!
        printOne();
        printTwo();
        printNumber(3);
        System.out.print(getNumber(4));
        System.out.print(getFive());
    }

    private static void printTwo() {
        System.out.print(2);
    }

    private static void printOne() {
        System.out.print(1);
    }

    private static int getFive() {
        return 5;
    }

    private static void printNumber(int number) {
        System.out.print(number);
    }

    private static int getNumber(int number) {
        return number;
    }



}
