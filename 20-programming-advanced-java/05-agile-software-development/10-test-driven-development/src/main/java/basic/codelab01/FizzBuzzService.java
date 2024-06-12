package basic.codelab01;

public class FizzBuzzService {
    public String[] generate(int n) throws IllegalArgumentException {
        if(n <= 1)
            throw new IllegalArgumentException("n can't be lower or equal then 1");
        String[] result = new String[n];
        for(int i = 0; i < n; i++) {
            if(isDivisibleBy(i+1,3) && isDivisibleBy(i+1,5)) {
                result[i] = "FizzBuzz";
            }
            else if(isDivisibleBy(i+1,5)) {
                result[i] = "Buzz";
            }
            else if(isDivisibleBy(i+1,3)) {
                result[i] = "Fizz";
            }
            else {
                result[i] = Integer.toString(i + 1);
            }
        }
        return result;
    }

    public boolean isDivisibleBy(int n, int divisor) {
        return (n % divisor == 0);
    }
}