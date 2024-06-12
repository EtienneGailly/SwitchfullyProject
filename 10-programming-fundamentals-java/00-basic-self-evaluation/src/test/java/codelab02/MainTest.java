package codelab02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void getAlphabet() {
        Assertions.assertThat(Main.getAlphabet()).containsExactly('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    }

    @Test
    void replace3thElement_WeCanDoIt() {
        Assertions.assertThat(Main.replace3thElement(new String[]{"we", "can", "work", "it"})).containsExactly("we", "can", "do", "it");
    }

    @Test
    void replace3thElement_YouShouldDoIt() {
        Assertions.assertThat(Main.replace3thElement(new String[]{"you", "should", "work", "it"})).containsExactly("you", "should", "do", "it");
    }
}
