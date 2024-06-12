package basic.solutions;

import java.util.Scanner;

public class DecisionMakingCodelab06Solution {

    /**
     * Make a program that will ask the user: "Which kind of greeting do you want (hello/goodbye)? "
     * Depending on the answer you print out a different message:
     * - in case of 'hello': "We welcome you to our awesome application!"
     * - in case of 'goodbye': "Goodbye, hope to see you again."
     *
     * You can make your life easier by just copying the code from the previous exercise and use that as a starting point.
     * Finished? Try it out!
     *
     * Before we continue, did you think of the edge cases?
     * Try to think of all the different ways a user can break your small application.
     * Which ones can you prevent?
     * Adapt your solution with guard clauses so that even if the user writes something unexpected, your program still behaves in a logical way.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which kind of greeting do you want (hello/goodbye)? ");
        String userInput = scanner.nextLine();
        System.out.println(calculateResponse(userInput));
    }

    private static String calculateResponse(String userInput) {
        if(userInput.isEmpty()){
            return "Please fill in either \"hello\" or \"goodbye\".";
        }

        if(!userInput.equalsIgnoreCase("hello") && !userInput.equalsIgnoreCase("goodbye")) {
            return userInput + " is not a valid type of message. Please fill in either \"hello\" or \"goodbye\".";
        }

        if(userInput.equalsIgnoreCase("hello")){
            return "We welcome you to our awesome application!";
        }
        return "Goodbye, hope to see you again.";
    }
}
