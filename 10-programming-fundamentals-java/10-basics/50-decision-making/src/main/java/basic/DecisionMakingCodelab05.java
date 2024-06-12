package basic;

import java.util.Scanner;

public class DecisionMakingCodelab05 {


    /**
     * Let's start with some more practical work.
     *
     * In most cases is a program driven by user input. Often this is done by the user clicking on some kind of button.
     *
     * However a java program can also receive input from the console.
     * With "Scanner scanner = new Scanner(System.in);" you can create an object that can listen to user Input from the console.
     *
     * To start actually listening to input write the following line: "String userInput = scanner.nextLine();"
     * When this line is executed, the program will stop executing and waits until it receives input from the user
     * after which it will start executing again.
     * Everything the user has typed will be stored in the userInput variable.
     *
     * Try it out yourself!
     * Start the following program and try typing something in the console. Press enter when you're finished.
     *
     * Did it work?
     * Let's go to the next exercise and apply it!
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide some input: ");
        String userInput = scanner.nextLine();
        System.out.println("The user has typed: " + userInput);
    }
}
