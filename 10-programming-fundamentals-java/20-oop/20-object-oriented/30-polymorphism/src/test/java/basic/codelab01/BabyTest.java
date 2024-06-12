package basic.codelab01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This test should not be changed.
 * This test should remain green
 */
class BabyTest {

    @Test
    void makeSound() {
        // given
        String expectedSound = "Wheeeeeiiiii!";
        Baby baby = new Baby();

        // when
        String actualSound = baby.makeSound();

        // then
        Assertions.assertThat(actualSound).isEqualTo(expectedSound);
    }

}
