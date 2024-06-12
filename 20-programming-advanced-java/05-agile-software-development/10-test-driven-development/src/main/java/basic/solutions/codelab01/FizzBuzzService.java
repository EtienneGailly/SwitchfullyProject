package basic.solutions.codelab01;

public class FizzBuzzService {

    public String[] fizzBuzz(int total) {
        if (total <= 1) {
            throw new IllegalArgumentException();
        }
        String[] result = new String[total];
        for (int index = 0; index < total; index++) {
            result[index] = calculateNextElement(index);
        }
        return result;
    }

    private static String calculateNextElement(int index) {
        if((index + 1) % 15 == 0) {
            return "FizzBuzz";
        } else if((index + 1) % 3 == 0) {
            return "Fizz";
        } else if((index + 1) % 5 == 0) {
            return "Buzz";
        } else {
            return "" + (index + 1);
        }
    }
}
