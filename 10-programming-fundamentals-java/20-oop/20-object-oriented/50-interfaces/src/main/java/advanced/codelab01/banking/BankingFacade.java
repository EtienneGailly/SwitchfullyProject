package advanced.codelab01.banking;

/**
 * The interface use to perform basic banking operations
 * Other classes can implement this interface and create their own implementations of the specified abstract methods.
 * (You don't have to change anything here)
 */
public interface BankingFacade {

    double getBalance();
    double withdraw(String uncheckedAmount);
    double deposit(String uncheckedAmount);

}
