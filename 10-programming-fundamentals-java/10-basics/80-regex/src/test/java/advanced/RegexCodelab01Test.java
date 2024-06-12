package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RegexCodelab01Test {
    List<String> strings = List.of("apple", "apple pear", "Tomato", "banana", "PENNY", "apples", "apple apples", "", " ", "!#@^a&'(", "GREEN");

    @Test
    void isTheWordApple() {
        Assertions.assertThat(strings.stream().filter(RegexCodelab01::isTheWordApple)).hasSize(1);
    }

    @Test
    void isAllLowerCase() {
        Assertions.assertThat(strings.stream().filter(RegexCodelab01::isAllLowerCaseLetters)).hasSize(4);
    }

    @Test
    void isAllUpperCase() {
        Assertions.assertThat(strings.stream().filter(RegexCodelab01::isAllUpperCaseLetters)).hasSize(3);
    }

    @Test
    void isAllLetters() {
        Assertions.assertThat(strings.stream().filter(RegexCodelab01::isAllLetters)).hasSize(7);
    }

    @Test
    void isAllLettersOrSpaces() {
        Assertions.assertThat(strings.stream().filter(RegexCodelab01::isAllLettersOrSpaces)).hasSize(10);
    }
}
