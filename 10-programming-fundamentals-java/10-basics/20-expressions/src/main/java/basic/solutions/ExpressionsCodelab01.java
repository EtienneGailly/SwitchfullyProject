package basic.solutions;

public class ExpressionsCodelab01 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 1");
        System.out.println("--------------");

        // ----------------
        // Which of the following statements contain an expression?
        // Which part of the statement is an expression?

        int someVariable;               //1 No
        int someVariable2 = 2;          //2 No
        int someVariable3 = 2 + 2;      //3 Yes -> 2 + 2
        print(2 * 2);                   //4 Yes -> 2 * 2
        printHelloWorld();              //5 No
    }

    public static void print(int toPrint) {
        System.out.println(toPrint);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

}
