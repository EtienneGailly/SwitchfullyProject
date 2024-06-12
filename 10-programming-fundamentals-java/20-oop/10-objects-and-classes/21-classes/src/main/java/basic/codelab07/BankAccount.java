package basic.codelab07;

import java.util.Objects;

public class BankAccount {
    private String accountNumber;
    private String name;
    private int balance;

    public BankAccount(String accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount > this.balance){
            System.out.println("Error, insufficient balance");
            return this.balance;
        }
        this.balance -= amount;
        return this.balance;
    }

    public int transfer(BankAccount destination, int amount) {
        if (amount > this.balance){
            System.out.println("Error, insufficient balance");
            return this.balance;
        }
        this.debit(amount);
        destination.credit(amount);
        return this.balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + "'" + accountNumber + "'" +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return getAccountNumber() == that.getAccountNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getAccountNumber());
    }
}
