package basic.solutions.codelab03;

import java.util.Random;

public class Account {
  private double balance;
  private final AccountOwner owner;
  private final int accountNumber;
  private static int accountCounter = 0;

  public Account(double balance, AccountOwner owner) {
    this.balance = balance;
    this.owner = owner;
    this.accountNumber = new Random().nextInt(50000001);
    accountCounter++;
  }

  public void withdraw(double amount) {
    if(balance - amount < 0 || amount > 5000) {
      System.out.println("This withdrawal is not possible");
    } else {
      balance -= amount;
    }
  }
  public void deposit(double amount) {
    if(amount > 80000) {
      System.out.println("This deposit is not possible");
    } else {
      balance += amount;
    }
  }
  public double getBalance() {
    return balance;
  }
  public int getAccountNumber() {
    return accountNumber;
  }

  public static int getNumberOfAccounts() {
    return accountCounter;
  }

  @Override
  public String toString() {
    return "Account with number " + accountNumber + " and owner " + owner.toString() +
      " has balance " + balance;
  }
}
