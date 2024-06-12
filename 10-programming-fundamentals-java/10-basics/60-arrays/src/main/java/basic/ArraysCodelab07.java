package basic;

import java.util.Arrays;

public class ArraysCodelab07 {


    /**
     * Change the following code so that it uses an array instead of a list of variables.
     * Can you see that after the change this code has become more flexible?
     *
     * Don't worry about the method calculateSumOrAverage. Just know that it can accept a variable number of arguments OR an array.
     */
    public static void main(String[] args) {
        double[] numberList = {34,12,24,89,10,96,74,67,46,53};
        double average = calculateSumOrAverage(numberList);
        System.out.println("The average is: " + average);
    }

    private static double calculateSumOrAverage(double... numbers) {
        return Arrays.stream(numbers).sum() / 10;
    }
}
