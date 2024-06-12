package basic.solutions;

public class ExpressionsCodelab04 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 4");
        System.out.println("--------------");

        // ----------------
        // Create an int variable and give it the value 5
        // Create a second int variable and give it the value 6
        // Increase the first int with the value of the second int
        // Print the result using: System.out.println("Printing sum: " + <YOUR_FIRST_VARIABLE>);

        int someInt = 5;
        int someOtherInt = 6;

        someInt += someOtherInt;

        System.out.println("Printing sum: " + someInt);
    }
}
