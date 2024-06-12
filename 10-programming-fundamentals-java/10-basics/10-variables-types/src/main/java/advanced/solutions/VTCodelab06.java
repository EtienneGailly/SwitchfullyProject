package advanced.solutions;

public class VTCodelab06 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 7");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a short variable, give it value 127
        // Declare a byte variable, initialize it with the short variable, cast it to a byte
        // Print the result using: System.out.println("Printing a byte initialized with a cast short (127): " + <YOUR_BYTE_VARIABLE_NAME>);
        // Looks as expected, right?

        short aShort = 127;
        byte aByte = (byte) aShort;
        System.out.println("Printing a byte initialized with a cast short (127): " + aByte);

        // Even though the short is short enough (pun so intended), java will ask you to explicitly cast it to a byte.
        // Java will prevent you putting things from a big box into a small box even though the big box contents are small enough to fit into the small box.
    }

}
