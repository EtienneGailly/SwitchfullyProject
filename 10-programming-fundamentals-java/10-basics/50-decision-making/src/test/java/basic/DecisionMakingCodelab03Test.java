package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DecisionMakingCodelab03Test {

    @Test
    public void uniqueSum() throws Exception {
        assertThat(DecisionMakingCodelab03.uniqueSum(1, 2, 3)).isEqualTo(6);
        assertThat(DecisionMakingCodelab03.uniqueSum(3, 2, 3)).isEqualTo(2);
        assertThat(DecisionMakingCodelab03.uniqueSum(3, 3, 3)).isEqualTo(0);
        assertThat(DecisionMakingCodelab03.uniqueSum(8, 3, 3)).isEqualTo(8);
    }

}
