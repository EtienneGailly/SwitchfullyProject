package basic.codelab01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class FizzBuzzServiceTest {
    FizzBuzzService fizzBuzzService;

    @BeforeEach
    void setUp() {
        fizzBuzzService = new FizzBuzzService();
    }

    @Test
    void givenANumber_ThenReturnArrayOfNumbersAndFizzAndBuzz() {
        String[] array = fizzBuzzService.generate(5);
        Assertions.assertEquals(5, array.length);
        Assertions.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, array);
    }

    @Test
    void givenAHighNumber_ThenFizzBuzzHasToBeInTheArray() {
        String[] array = fizzBuzzService.generate(20);
        Assertions.assertEquals("FizzBuzz", array[14]);
    }

    @Test
    void givenANumberEqualOrLowerThan1_ThenThrowIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fizzBuzzService.generate(0);
        });
    }
}