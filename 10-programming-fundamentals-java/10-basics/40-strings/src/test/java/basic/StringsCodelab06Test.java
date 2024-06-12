package basic;

import basic.StringsCodelab06;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringsCodelab06Test {

    @Test
    public void doubleText() throws Exception {
        Assertions.assertThat(StringsCodelab06.doubleText("Program"))
                .isEqualTo("ProgramProgram");
    }

    @Test
    public void isCorrectlyDoubled() throws Exception {
        Assertions.assertThat(StringsCodelab06.isCorrectlyDoubled("Programmer", "ProgrammerProgrammer"))
                .isTrue();
        Assertions.assertThat(StringsCodelab06.isCorrectlyDoubled("Programmer", "ProgrammerProgramm"))
                .isFalse();
    }

}
