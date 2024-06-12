package basic.solutions;

public class VTCodelab17 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 17");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize an long variable, give it value 10 000 000 000
        // Declare a int variable, initialize it with the long variable but explicitly cast it to a int
        // How is this different than assignment 6?
        // Print the result using: System.out.println("Printing an int initialized with a cast long: " + <YOUR_LONG_VARIABLE_NAME>);

        long aLong = 10000000000L; // the 'L' is important here
        int anInt = (int) aLong;
        // You can force a long in an int by casting it explicitly. Everything that makes the long too big will be thrown away.
        System.out.println("Printing an int initialized with a cast long: " + anInt);
    }

}
