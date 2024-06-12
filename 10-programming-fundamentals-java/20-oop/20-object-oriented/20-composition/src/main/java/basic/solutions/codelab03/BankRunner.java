package basic.solutions.codelab03;

import java.util.Scanner;

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

    AccountOwner owner1 = new AccountOwner(firstName, lastName);
    Account acc1 = new Account(balance, owner1);

    System.out.println(acc1.getBalance());
    acc1.deposit(2000);
    System.out.println(acc1.getBalance());
    acc1.withdraw(1500);
    System.out.println(acc1.getBalance());

  }
}
