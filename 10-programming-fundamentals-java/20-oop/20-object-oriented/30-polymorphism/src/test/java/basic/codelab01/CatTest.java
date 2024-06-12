package basic.codelab01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This test should not be changed.
 * This test should remain green
 */
class CatTest {

    @Test
    void makeSound() {
        // given
        String expectedSound = "Miauw!";
        Cat cat = new Cat();

        // when
        String actualSound = cat.makeSound();

        // then
        Assertions.assertThat(actualSound).isEqualTo(expectedSound);
    }

}
