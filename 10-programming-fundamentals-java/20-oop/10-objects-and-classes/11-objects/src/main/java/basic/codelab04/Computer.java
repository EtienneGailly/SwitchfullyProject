package basic.codelab04;

/**
 * You don't have to change anything in this class.
 */
public class Computer {

    private static final String DEFAULT_BRAND = "HP";
    private static final int DEFAULT_PRICE = 89900;
    private static final int DEFAULT_PRICE_FOR_KNOWN_BRAND = 59500;

    /**
     * By adding the final keyword, we make the field immutable.
     * This means it can be only given a value upon creating the object (in the constructor).
     * Once the object is created, the field (e.g. brand) can not receive a different value.
     */
    private final String brand;
    private final int priceInDollarCents;

    // This is a constructor
    public Computer() {
        brand = DEFAULT_BRAND;
        priceInDollarCents = DEFAULT_PRICE;
    }

    // This is a constructor
    public Computer(String aBrand) {
        brand = aBrand;
        priceInDollarCents = DEFAULT_PRICE_FOR_KNOWN_BRAND;
    }

    // This is a constructor
    public Computer(int aPriceInDollarCents) {
        brand = DEFAULT_BRAND;
        priceInDollarCents = aPriceInDollarCents;
    }

    // This is a constructor
    public Computer(String aBrand, int aPriceInDollarCents) {
        brand = aBrand;
        priceInDollarCents = aPriceInDollarCents;
    }

    /**
     * Method to 'convert' a Computer to a textual (String) representation / version
     * @return the textual (String) representation of a Computer
     */
    @Override
    public String toString() {
        return "I'm a computer of brand " + brand + " and I cost " + priceInDollarCents + " dollar(cents)";
    }
}
