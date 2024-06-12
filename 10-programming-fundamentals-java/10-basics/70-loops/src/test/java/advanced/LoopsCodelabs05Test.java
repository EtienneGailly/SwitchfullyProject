package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class LoopsCodelabs05Test {

    @Test
    public void minMaxDifference() throws Exception {
        Assertions.assertThat(LoopsCodelabs05.minMaxDifference(new int[]{10,3,5,6})).isEqualTo(7);
        Assertions.assertThat(LoopsCodelabs05.minMaxDifference(new int[]{7,2,10,9})).isEqualTo(8);
        Assertions.assertThat(LoopsCodelabs05.minMaxDifference(new int[]{2,10,7,2})).isEqualTo(8);
        Assertions.assertThat(LoopsCodelabs05.minMaxDifference(new int[]{1,10,2})).isEqualTo(9);
        Assertions.assertThat(LoopsCodelabs05.minMaxDifference(new int[]{10,2})).isEqualTo(8);
        Assertions.assertThat(LoopsCodelabs05.minMaxDifference(new int[]{10,10,10,10,10})).isEqualTo(0);
        Assertions.assertThat(LoopsCodelabs05.minMaxDifference(new int[]{10,10,10,10,15})).isEqualTo(5);
    }

    @Test
    public void minMaxDifference_givenArrayTooSmall_thenReturn0() throws Exception {
        Assertions.assertThat(LoopsCodelabs05.minMaxDifference(new int[]{10})).isEqualTo(0);
        Assertions.assertThat(LoopsCodelabs05.minMaxDifference(new int[]{})).isEqualTo(0);
    }

}
