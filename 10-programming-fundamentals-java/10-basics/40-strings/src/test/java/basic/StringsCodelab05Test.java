package basic;

import basic.StringsCodelab05;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringsCodelab05Test {

    @Test
    public void replaceCharacter() throws Exception {
        Assertions.assertThat(StringsCodelab05.replaceCharacter("An apple a day keeps the doctor away", 'a', 'u'))
                .isEqualTo("un upple u duy keeps the doctor uwuy");
        Assertions.assertThat(StringsCodelab05.replaceCharacter("An apple a day keeps the doctor away", 'a', 'U'))
                .isEqualTo("Un Upple U dUy keeps the doctor UwUy");
        Assertions.assertThat(StringsCodelab05.replaceCharacter("Dogs and cats go hand in hand", 'g', 'T'))
                .isEqualTo("DoTs and cats To hand in hand");
    }

}
