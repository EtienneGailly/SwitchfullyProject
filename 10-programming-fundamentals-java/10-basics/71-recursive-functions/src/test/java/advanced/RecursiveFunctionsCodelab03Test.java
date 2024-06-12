package advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecursiveFunctionsCodelab03Test {

    @Test
    void willPutAStarBetweenTwoCharacterThatAreTheSame() {
        assertThat(RecursiveFunctionsCodelab03.pairStar("hello")).isEqualTo("hel*lo");
        assertThat(RecursiveFunctionsCodelab03.pairStar("xxyy")).isEqualTo("x*xy*y");
        assertThat(RecursiveFunctionsCodelab03.pairStar("aaaa")).isEqualTo("a*a*a*a");
    }
}
