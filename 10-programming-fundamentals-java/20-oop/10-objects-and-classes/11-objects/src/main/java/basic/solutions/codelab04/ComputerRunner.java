package basic.solutions.codelab04;

/**
 * Do the following
 * ------------------
 * 1. Start by creating a main method.
 * 2. Then create 4 different computers (Computer objects)
 * - A generic computer
 * - A computer of brand "Sony", don't specify a price
 * - A computer with price 88800 (in dollarCents), don't specify the brand
 * - A computer with brand "Apple" and with price (in dollarCents) 159500
 * <p>
 * 3. For every computer, call the toString() method and print the result
 * <p>
 * Tip: instead of manually, 4 times, calling the toString() method for every computer
 * try and store the Computer objects you created inside an array and then loop (for-each)
 * over that array, each time calling the toString() method and printing the result
 */
public class ComputerRunner {

    public static void main(String[] args) {
        System.out.println(new Computer());
        System.out.println(new Computer("Sony"));
        System.out.println(new Computer(88800));
        System.out.println(new Computer("Apple", 88800));
    }
}
