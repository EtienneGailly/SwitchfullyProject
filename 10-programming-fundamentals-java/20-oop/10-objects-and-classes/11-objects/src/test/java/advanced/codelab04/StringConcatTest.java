package advanced.codelab04;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringConcatTest {

    @Test
    void joinLorem_isCorrect() {
        String[] lorem = {"Lorem","ipsum","dolor","sit","amet", "jotum"};
        String expected = "Lorem ipsum dolor sit amet jotum.";

        Assertions.assertThat(StringConcat.joinLorem(lorem))
                .describedAs("Lorem string objects should be equal.")
                .isEqualTo(expected);
    }

    @Test
    void buildLorem_isCorrect() {
        String[] lorem = {"Lorem","ipsum","dolor","sit","amet", "situm"};
        String expected = "Lorem ipsum dolor sit amet situm.";

        Assertions.assertThat(StringConcat.buildLorem(lorem))
                .describedAs("Lorem string objects should be equal.")
                .isEqualTo(expected);
    }

}
