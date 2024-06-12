package basic;

import java.util.Scanner;

public class DecisionMakingCodelab07 {

    /**
     * This application will calculate the square root of a provided number.
     * In which different ways can the user break the application by providing incorrect input?
     *
     * Provide guard clauses so that the user will get an appropriate response in case he/she provides a wrong input.
     *
     * Hint: You can make use of the isInteger() function to help you.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide a number: ");
        String userInput = scanner.nextLine();

        if (isInteger(userInput)){
            System.out.println("*******************");
            System.out.println();
            System.out.println(squareRoot(userInput));
        }
        else {
            System.out.println("Invalid input");
        }
    }

    private static String squareRoot(String number) {
        return "" + Math.sqrt(Integer.parseInt(number));
    }

    /**
     * This is a method you can use to test if a String is a number or not.
     * You don't need to change anything about this method.
     */
    private static boolean isInteger(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
