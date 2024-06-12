package basic;

public class ExpressionsCodelab01 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 1");
        System.out.println("--------------");

        // ----------------
        // Which of the following statements contain an expression?
        // Which part of the statement is an expression?

        int someVariable;               //1 no
        int someVariable2 = 2;          //2 no
        int someVariable3 = 2 + 2;      //3 yes
        print(2 * 2);                   //4 yes
        printHelloWorld();              //5 no
    }

    public static void print(int toPrint) {
        System.out.println(toPrint);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

}
