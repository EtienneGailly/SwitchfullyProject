package basic;

import basic.StringsCodelab04;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringsCodelab04Test {

    @Test
    public void findIndexOfWord() throws Exception {
        Assertions.assertThat(StringsCodelab04.findIndexOfWord("This text contains word", "word")).isEqualTo(19);
        Assertions.assertThat(StringsCodelab04.findIndexOfWord("Nothing to find", "nope")).isEqualTo(-1);
        Assertions.assertThat(StringsCodelab04.findIndexOfWord("Good day, sir", "day")).isEqualTo(5);
    }

}
