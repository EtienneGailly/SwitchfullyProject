package basic;

public class VTCodelab17 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 17");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a long variable, give it value 10 000 000 000
        // Declare a int variable, initialize it with the long variable but explicitly cast it to an int
        // How is this different than assignment 6?
        // Print the result using: System.out.println("Printing a int initialized with a cast long: " + <YOUR_INT_VARIABLE_NAME>);

        long myLong = 100000000000L;
        int myInt = (int) myLong; // using casting converts the value in some way
        System.out.println("Printing a int initialized with a cast long: " + myInt);

    }

}
