package advanced.solutions;

public class RecursiveFunctionsCodelab02Solution {

    /**
     * Create a method that will return the n-th fibonacci number.
     * E.g.
     * fibonacci(1) = 1
     * fibonacci(2) = 1
     * fibonacci(3) = 2
     * fibonacci(4) = 3
     * fibonacci(5) = 5
     * fibonacci(6) = 8
     * ...
     * fibonacci(n) = fibonacci(n - 1) + fibonacci (n - 2)
     */
    public static int fibonacci(int number) {
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
