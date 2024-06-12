package advanced;

public class VTCodelab07 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 8");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a short variable, give it value 128
        // Declare a byte variable, initialize it with the short variable, cast it to a byte
        // Print the result using: System.out.println("Printing a byte initialized with a cast short (128): " + <YOUR_BYTE_VARIABLE_NAME>);
        // Does it look as expected? Write a comment on why (not)?

        short myShort = 128;
        System.out.println(Integer.toBinaryString(myShort));
        byte myByte = (byte) myShort;
        System.out.println("Printing a byte initialized with a cast short (128): " + myByte); //Won't look as expected because 128 is outside byte range

    }

}
