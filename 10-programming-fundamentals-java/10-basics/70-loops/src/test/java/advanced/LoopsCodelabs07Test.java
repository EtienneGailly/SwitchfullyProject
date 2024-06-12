package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class LoopsCodelabs07Test {

    @Test
    public void getAmountOfSquads() throws Exception {
        Assertions.assertThat(LoopsCodelabs07.getAmountOfSquads(new int[]{1, 2, 2, 2, 3, 4, 4})).isEqualTo(2);
        Assertions.assertThat(LoopsCodelabs07.getAmountOfSquads(new int[]{1, 1, 2, 1, 1})).isEqualTo(2);
        Assertions.assertThat(LoopsCodelabs07.getAmountOfSquads(new int[]{1, 1, 1, 1, 1})).isEqualTo(1);
        Assertions.assertThat(LoopsCodelabs07.getAmountOfSquads(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 2, 2})).isEqualTo(3);
        Assertions.assertThat(LoopsCodelabs07.getAmountOfSquads(new int[]{5})).isEqualTo(5);
    }

    @Test
    public void getAmountOfSquads_givenEmptyArrya_thenThrowException() throws Exception {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> LoopsCodelabs07.getAmountOfSquads(new int[]{}));
        assertEquals("The argument array can not be empty", illegalArgumentException.getMessage());
    }

}
