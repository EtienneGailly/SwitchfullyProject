package advanced.codelab01.banking;

/**
 * A very dummy, and even incorrect, implementation of the BankingFacade
 * (You don't have to change anything here)
 */
public class SimpleBanking implements BankingFacade {

    private double balance;

    public SimpleBanking(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double withdraw(String uncheckedAmount) {
        return --balance;
    }

    @Override
    public double deposit(String uncheckedAmount) {
        return ++balance;
    }
}
