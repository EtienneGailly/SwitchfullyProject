package basic.codelab03;

import java.util.Scanner;

/**
 * Read the README.md file
 */
public class BankRunner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account owner's firstname");
        String firstName = scan.next();
        System.out.println("Enter account owner's lastname");
        String lastName = scan.next();
        System.out.println("Enter account's initial balance");
        double balance = scan.nextDouble();

        // continue here


    }

}
