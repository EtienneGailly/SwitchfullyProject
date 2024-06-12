package advanced.solutions;

public class ExpressionsCodelab01 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 1");
        System.out.println("--------------");

        // ----------------
        // Create a short variable that holds the product of 2 other short variables (with values 5 and 105)
        // Does it work? Write a comment on why (not)

        short leftOperand = 5;
        short rightOperand = 105;
        short sum = (short) (leftOperand + rightOperand);

        // When using a variable of a specific type (short) as one of the operands of the + operator,
        // the resulting value will be of type int. We try to store that value in a variable of type short,
        // so we have to cast the result of the + operator to type short.
    }

}
