package basic.solutions.codelab01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FizzBuzzServiceTest {

    FizzBuzzService fizzBuzzService = new FizzBuzzService();

    @Test
    void given2_whenCallingFizzBuzz_thenReturn_1_2() {
        //GIVEN
        int total = 2;

        //WHEN
        String[] actual = fizzBuzzService.fizzBuzz(total);

        //THEN
        assertThat(actual).containsExactly("1", "2");
    }

    @Test
    void given1_whenCallingFizzBuzz_thenThrowException() {
        //GIVEN
        int total = 1;

        //WHEN & THEN
        assertThatThrownBy(() -> fizzBuzzService.fizzBuzz(total))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void given3_whenCallingFizzBuzz_thenNumbersDivisibleBy3WillBeFizz() {
        //GIVEN
        int total = 3;

        //WHEN
        String[] actual = fizzBuzzService.fizzBuzz(total);

        //THEN
        assertThat(actual).containsExactly("1", "2", "Fizz");
    }

    @Test
    void given5_whenCallingFizzBuzz_thenNumbersDivisibleBy5WillBeBuzz() {
        //GIVEN
        int total = 5;

        //WHEN
        String[] actual = fizzBuzzService.fizzBuzz(total);

        //THEN
        assertThat(actual).containsExactly("1", "2", "Fizz", "4", "Buzz");
    }

    @Test
    void given15_whenCallingFizzBuzz_thenNumbersDivisibleBy15WillBeFizzBuzz() {
        //GIVEN
        int total = 15;

        //WHEN
        String[] actual = fizzBuzzService.fizzBuzz(total);

        //THEN
        assertThat(actual).containsExactly("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
    }
}
