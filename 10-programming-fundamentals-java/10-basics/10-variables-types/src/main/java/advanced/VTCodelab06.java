package advanced;

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

        short myShort = 127;
        byte myByte = (byte) myShort;
        System.out.println("Printing a byte initialized with a cast short (127): " + myByte);

    }

}
