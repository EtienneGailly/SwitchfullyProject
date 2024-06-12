package basic.solutions;

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

        int anInt = 10;
        long aLong = anInt;
        // This does work because when converting an int to a long, you do not loose information.
        // That is why java will automatically cast an int to a long when needed
        // You can fit a smaller box in a bigger box.
        System.out.println("Printing a long initialized with an int: " + aLong);
    }

}
