package basic.solutions.codelab07;

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
        return balance += amount;
    }

    public int debit(int amount) {
        if(balance - amount < 0) {
            System.out.println("Not enough money to debit this amount");
            return balance;
        }
        return balance -= amount;
    }

    public int transfer(BankAccount otherBankAccount, int amount) {
        if(balance < amount) {
            System.out.println("Not enough money to do transfer");
            return balance;
        }
        this.debit(amount);
        otherBankAccount.credit(amount);
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
