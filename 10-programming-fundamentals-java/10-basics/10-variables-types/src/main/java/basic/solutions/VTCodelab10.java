package basic.solutions;

public class VTCodelab10 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 10");
        System.out.println("--------------");

        // ----------------
        // Print out the characters 'H' 'E' 'L' 'L' 'O' in this exact order, on one line
        // It's possible a number instead of HELLO is printed, why do you think this is?

        System.out.println('H' + 'E' + 'L' + 'L' + 'O');
        // a char will be automatically cast (converted) to a number when used in an expression
        // every char has its own number (for example 'a' = 97 and 'A' = 65)
        // that's why the result of the above printout is 372 = 72 ('H') + 69 ('E') + 76 ('L') + 76 ('L') + 79 ('O')

        // if you want to concatenate chars together start your expression with ""
        // this will tell the system that the final result needs to be String
        System.out.println("" + 'H' + 'E' + 'L' + 'L' + 'O');
    }

}
