package basic;

public class VTCodelab16 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 16");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize an int variable, give it value 10
        // Declare a long variable, initialize it with the int variable
        // Does it work? Write a comment on why (not)?
        // Print the result using: System.out.println("Printing a long initialized with an int: " + <YOUR_LONG_VARIABLE_NAME>);

        int myInt = 10;
        long myLong = myInt; //This works because a long is bigger than an int, it can contain it
        System.out.println("Printing a long initialized with an int: " + myLong);

    }

}
