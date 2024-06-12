package basic;

public class VTCodelab19 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 19");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a double variable, give it value 45.95
        // Declare an int variable, initialize it with the double variable, but this time, cast it to an int
        // Does it work? Write a comment on why (not)?
        // Print the result using: System.out.println("Printing an int initialized with a cast double: " + <YOUR_LONG_VARIABLE_NAME>);
        // Do you notice something about what is printed?

        double myDouble = 45.95;
        int myInt = (int) myDouble;
        System.out.println("Printing an int initialized with a cast double: " + myInt);

    }

}
