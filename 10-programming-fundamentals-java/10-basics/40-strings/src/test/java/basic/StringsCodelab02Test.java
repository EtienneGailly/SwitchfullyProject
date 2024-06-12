package basic;

import basic.StringsCodelab02;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringsCodelab02Test {

    @Test
    public void wrapWord() throws Exception {
        Assertions.assertThat(StringsCodelab02.wrapWord("xxxx", "oOo")).isEqualTo("xxoOoxx");
        Assertions.assertThat(StringsCodelab02.wrapWord("[[]]", "yo yo")).isEqualTo("[[yo yo]]");
    }

}
