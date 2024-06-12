package basic.solutions;

public class ExpressionsCodelab06 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 6");
        System.out.println("--------------");

        // ----------------
        // Create an int variable that holds the product of 2 other int variables (123456789 and 1000)
        // Print the result using: System.out.println("Printing product: " + <YOUR_PRODUCT_VARIABLE_NAME>);
        // Inspect the result, does it look as desired?

        int leftOperand = 123456789;
        int rightOperand = 1000;
        int product = leftOperand * rightOperand;
        System.out.println("Printing product: " + product);
        // No, again a numerical overflow

        int leftOperandFixed = 123456789;
        long rightOperandFixed = 1000;
        long productFixed = leftOperandFixed * rightOperandFixed;
        System.out.println("Printing product: " + productFixed);
        // This is better, no precision is lost
    }

}
