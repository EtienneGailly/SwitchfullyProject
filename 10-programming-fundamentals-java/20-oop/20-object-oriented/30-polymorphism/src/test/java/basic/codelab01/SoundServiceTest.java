package basic.codelab01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * These tests should not be changed and should remain green!
 * However, make sure to create a new test for which you pass a mixed array of Cat, Dog, Baby and Computer objects
 */
class SoundServiceTest {

    @Test
    void allMakeSound_givenBabyArray_returnBabySound() {
        // given
        String expectedSound = String.format("Wheeeeeiiiii!%nWheeeeeiiiii!");

        // when
        String actualSound = SoundService.allMakeSound(new Baby[]{new Baby(), new Baby()});

        // then
        Assertions.assertThat(actualSound).isEqualToNormalizingNewlines(expectedSound);
    }

    @Test
    void allMakeSound_givenComputerArray_returnComputerSound() {
        // given
        String expectedSound = String.format("Bleep Bloop Bleep!%nBleep Bloop Bleep!");

        // when
        String actualSound = SoundService.allMakeSound(new Computer[]{new Computer(), new Computer()});

        // then
        Assertions.assertThat(actualSound).isEqualToNormalizingNewlines(expectedSound);
    }

    @Test
    void allMakeSound_givenDogArray_returnDogSound() {
        // given
        String expectedSound = String.format("Nice to meet y.. I mean, WOOF WOOF WOOF!%nNice to meet y.. I mean, WOOF WOOF WOOF!%nNice to meet y.. I mean, WOOF WOOF WOOF!");

        // when
        String actualSound = SoundService.allMakeSound(new Dog[]{new Dog(), new Dog(), new Dog()});

        // then
        Assertions.assertThat(actualSound).isEqualToNormalizingNewlines(expectedSound);
    }

    @Test
    void allMakeSound_givenCatArray_returnCatSound() {
        // given
        String expectedSound = "Miauw!";

        // when
        String actualSound = SoundService.allMakeSound(new Cat[]{new Cat()});

        // then
        Assertions.assertThat(actualSound).isEqualToNormalizingNewlines(expectedSound);
    }

}
