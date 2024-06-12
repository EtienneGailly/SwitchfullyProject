package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DecisionMakingCodelab04Test {

    @Test
    public void playBlackjack() throws Exception {
        assertThat(DecisionMakingCodelab04.playBlackjack(19, 21)).isEqualTo(21);
        assertThat(DecisionMakingCodelab04.playBlackjack(21, 19)).isEqualTo(21);
        assertThat(DecisionMakingCodelab04.playBlackjack(19, 22)).isEqualTo(19);
        assertThat(DecisionMakingCodelab04.playBlackjack(5, 4)).isEqualTo(5);
        assertThat(DecisionMakingCodelab04.playBlackjack(10, 10)).isEqualTo(10);
        assertThat(DecisionMakingCodelab04.playBlackjack(22, 19)).isEqualTo(19);
    }

    @Test
    public void playBlackjack_givenBothCardValuesOver21_thenReturn0() throws Exception {
        assertThat(DecisionMakingCodelab04.playBlackjack(22, 25)).isZero();
        assertThat(DecisionMakingCodelab04.playBlackjack(22, 22)).isZero();
    }

}
