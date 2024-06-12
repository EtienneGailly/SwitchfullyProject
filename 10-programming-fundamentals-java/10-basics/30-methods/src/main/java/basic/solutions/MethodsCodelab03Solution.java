package basic.solutions;

public class MethodsCodelab03Solution {

    public static void main(String[] args) {
        // Call the calculatePercentageValue(...) method 3 times
        //      1. Using value 100 and 80%
        //      2. Using value 250 and 5%
        //      3. Using 625 and 25%
        // Make sure to print (write to the console) each result.
        System.out.println(calculatePercentageValue(100, 0.8f));
        System.out.println(calculatePercentageValue(250, 0.05f));
        System.out.println(calculatePercentageValue(625, 0.25f));
    }

    /**
     * Calculates the percentage value of the given value using the given percentage.
     *      E.g. Given value 50 and 0.25 (percentage), returns value 12.5.
     * @param originalValue - the value for which we will calculate the percentage value
     * @param percentage - the percentage to use, range [0, 1]
     * @return the calculated percentage value
     */
    // (don't change this method)
    private static float calculatePercentageValue(int originalValue, float percentage) {
        return originalValue * percentage;
    }

}
