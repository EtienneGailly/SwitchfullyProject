package basic.codelab01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This test should not be changed.
 * This test should remain green
 */
class DogTest {

    @Test
    void makeSound() {
        // given
        String expectedSound = "Nice to meet y.. I mean, WOOF WOOF WOOF!";
        Dog dog = new Dog();

        // when
        String actualSound = dog.makeSound();

        // then
        Assertions.assertThat(actualSound).isEqualTo(expectedSound);
    }

}
