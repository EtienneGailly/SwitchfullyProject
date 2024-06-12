package basic.codelab01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This test should not be changed.
 * This test should remain green
 */
class ComputerTest {

    @Test
    void makeSound() {
        // given
        String expectedSound = "Bleep Bloop Bleep!";
        Computer computer = new Computer();

        // when
        String actualSound = computer.makeSound();

        // then
        Assertions.assertThat(actualSound).isEqualTo(expectedSound);
    }

}
