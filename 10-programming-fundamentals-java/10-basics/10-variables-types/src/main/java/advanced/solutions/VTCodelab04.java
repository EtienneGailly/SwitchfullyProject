package advanced.solutions;

public class VTCodelab04 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 4");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a byte variable
        // Declare a short variable and initialize it with the above byte variable
        // Does it work? Write a comment on why (not)? If the code doesn't compile, put the code itself in comment

        byte aByte = 100;
        short aShort = aByte;

        // A byte can be stored in a short since it is smaller than a short.
        // Java will thus automatically cast (convert) a byte to a short when needed
    }

}
