package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecisionMakingCodelab01Test {

    @Test
    public void is1Or2MoreThanAMultipleOf20_given20_thenReturnFalse() throws Exception {
        assertThat(DecisionMakingCodelab01.is1Or2MoreThanAMultipleOf20(20)).isFalse();
    }

    @Test
    public void is1Or2MoreThanAMultipleOf20_given21_thenReturnTrue() throws Exception {
        assertThat(DecisionMakingCodelab01.is1Or2MoreThanAMultipleOf20(21)).isTrue();
    }

    @Test
    public void is1Or2MoreThanAMultipleOf20_given22_thenReturnTrue() throws Exception {
        assertThat(DecisionMakingCodelab01.is1Or2MoreThanAMultipleOf20(22)).isTrue();
    }

    @Test
    public void is1Or2MoreThanAMultipleOf20_given23_thenReturnFalse() throws Exception {
        assertThat(DecisionMakingCodelab01.is1Or2MoreThanAMultipleOf20(23)).isFalse();
    }

    @Test
    public void is1Or2MoreThanAMultipleOf20_given81_thenReturnTrue() throws Exception {
        assertThat(DecisionMakingCodelab01.is1Or2MoreThanAMultipleOf20(81)).isTrue();
    }

    @Test
    public void is1Or2MoreThanAMultipleOf20_givenANegativeNumber_thenReturnFalse() throws Exception {
        assertThat(DecisionMakingCodelab01.is1Or2MoreThanAMultipleOf20(-21)).isFalse();
    }

}
