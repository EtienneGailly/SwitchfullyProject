package advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecursiveFunctionsCodelab01Test {

    @Test
    void givenZeroRepetitionsReturnEmptyString() {
        assertThat(RecursiveFunctionsCodelab01.repeatWord("anotherWord", 0)).isEqualTo("");
    }

    @Test
    void givenOneRepetitionWillReturnInputString() {
        assertThat(RecursiveFunctionsCodelab01.repeatWord("word", 1)).isEqualTo("word");
    }

    @Test
    void givenOneCharacterWillReturnRepetitionOfCharacter() {
        assertThat(RecursiveFunctionsCodelab01.repeatWord("A", 3)).isEqualTo("AAA");
    }

    @Test
    void givenWordCharacterWillReturnRepetitionOfWord() {
        assertThat(RecursiveFunctionsCodelab01.repeatWord("ABC", 4)).isEqualTo("ABCABCABCABC");
    }
}
