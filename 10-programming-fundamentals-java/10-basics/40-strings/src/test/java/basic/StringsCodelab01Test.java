package basic;

import basic.StringsCodelab01;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringsCodelab01Test {

    @Test
    public void helloNameBob() throws Exception {
        Assertions.assertThat(StringsCodelab01.helloName("Bob")).isEqualTo("Hello Bob!");
    }

    @Test
    public void helloNameXyz() throws Exception {
        Assertions.assertThat(StringsCodelab01.helloName("Xyz")).isEqualTo("Hello Xyz!");
    }

}
