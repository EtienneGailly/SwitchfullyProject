package advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoopsCodelabs02Test {

    @Test
    public void catDog_simpleCorrectExample() {
        assertThat(LoopsCodelabs02.catDog("catdog")).isTrue();
    }

    @Test
    public void catDog_givenEmptyString_thenFalse() {
        assertThat(LoopsCodelabs02.catDog("")).isFalse();
    }

    @Test
    public void catDog_givenNoDog_thenFalse() {
        assertThat(LoopsCodelabs02.catDog("catcat")).isFalse();
    }

    @Test
    public void catDog_givenCatAndDog_thenTrue() {
        assertThat(LoopsCodelabs02.catDog("1cat1cadodog")).isTrue();
    }

    @Test
    public void catDog_givenCatCatAndDog_thenFalse() {
        assertThat(LoopsCodelabs02.catDog("catcatdog")).isFalse();
    }

}
