package basic.solutions.codelab05;

import java.util.Objects;

/**
 * Override and implement the equals method so that the output - provided by the main method - matches the following:
 *      Should be TRUE: true
 *      Should be TRUE: true
 *      Should be FALSE: false
 *      Should be FALSE: false
 *
 * TIP: IntelliJ offers a way to automatically generate an equals method for you...
 *      - Do some Googlin'!
 *      - After generating the method, make sure to inspect it!
 *      - (You will have to make a change to it, so that it also handles case-sensitivity for the currency value)
 */
public class MoneyCoin {

    private final int value;
    private final String currency;

    public MoneyCoin(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    // override and implement the equals method here...

    /**
     * Don't change anything in the main method.
     * However, after having implemented the equals method,
     * the boolean results should match the expected values.
     */
    public static void main(String[] args) {
        MoneyCoin moneyCoinA = new MoneyCoin(50, "EUR");
        MoneyCoin moneyCoinB = new MoneyCoin(50, "EUR");
        MoneyCoin moneyCoinC = new MoneyCoin(50, "eur");
        MoneyCoin moneyCoinD = new MoneyCoin(45, "EUR");
        MoneyCoin moneyCoinE = new MoneyCoin(50, "USD");

        System.out.println("Should be TRUE: " + moneyCoinA.equals(moneyCoinB));
        System.out.println("Should be TRUE: " + moneyCoinA.equals(moneyCoinC)); // This is a tricky one
        System.out.println("Should be FALSE: " + moneyCoinA.equals(moneyCoinD));
        System.out.println("Should be FALSE: " + moneyCoinA.equals(moneyCoinE));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoneyCoin moneyCoin = (MoneyCoin) o;
        return value == moneyCoin.value && Objects.equals(currency.toLowerCase(), moneyCoin.currency.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }

    @Override
    public String toString() {
        return "MoneyCoin{" +
                "value=" + value +
                ", currency='" + currency + '\'' +
                '}';
    }
}
