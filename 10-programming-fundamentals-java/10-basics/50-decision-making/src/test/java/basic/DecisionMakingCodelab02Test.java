package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DecisionMakingCodelab02Test {

    @Test
    public void playLottery() throws Exception {
        assertThat(DecisionMakingCodelab02.playLottery(9, 1, 0)).isEqualTo(10);
        assertThat(DecisionMakingCodelab02.playLottery(11, 2, 0)).isEqualTo(0);
        assertThat(DecisionMakingCodelab02.playLottery(6, 1, 4)).isEqualTo(10);
        assertThat(DecisionMakingCodelab02.playLottery(20, 1, 9)).isEqualTo(10);
        assertThat(DecisionMakingCodelab02.playLottery(18, 4, 4)).isEqualTo(0);
        assertThat(DecisionMakingCodelab02.playLottery(18, 4, 8)).isEqualTo(5);
    }

}
