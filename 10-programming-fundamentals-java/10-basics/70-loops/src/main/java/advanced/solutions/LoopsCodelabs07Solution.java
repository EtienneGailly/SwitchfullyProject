package advanced.solutions;

public class LoopsCodelabs07Solution {

    /**
     * Say that a "squad" in an array is a series of 2 or more adjacent elements of the same value.
     * Return the number of squads in the given array.
     * If an array is passed with only 1 element, return that element
     * If an empty array is passed, throw an Illegal Argument Exception with message "The argument array can not be empty"
     * Examples:
     *      getAmountOfSquads([1, 2, 2, 2, 3, 4, 4]) → 2
     *      getAmountOfSquads([1, 1, 2, 1, 1]) → 2
     *      getAmountOfSquads([1, 1, 1, 1, 1]) → 1
     *      getAmountOfSquads([1]) → 1
     */
    public static int getAmountOfSquads(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The argument array can not be empty");
        }
        if (numbers.length == 1) {
            return numbers[0];
        }

        int previousNumber = -1; //This is not entirely correct. When will this fail?
        int numberOfSquads = 0;
        boolean isNewNumber = true;
        for (int number : numbers) {
            if (isNewNumber && previousNumber == number) {
                numberOfSquads++;
                isNewNumber = false;
            }
            if (previousNumber != number) {
                isNewNumber = true;
            }
            previousNumber = number;
        }
        return numberOfSquads;
    }

}
