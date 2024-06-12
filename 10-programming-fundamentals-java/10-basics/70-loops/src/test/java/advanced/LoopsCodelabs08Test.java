package advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LoopsCodelabs08Test {

    @Test
    public void doesOuterContainAllElementsOfInner() throws Exception {
        assertThat(LoopsCodelabs08.doesOuterContainAllElementsOfInner(new int[]{1, 2, 4, 6}, new int[]{2, 4})).isTrue();
        assertThat(LoopsCodelabs08.doesOuterContainAllElementsOfInner(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4})).isFalse();
        assertThat(LoopsCodelabs08.doesOuterContainAllElementsOfInner(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4})).isTrue();
        assertThat(LoopsCodelabs08.doesOuterContainAllElementsOfInner(new int[]{1, 2, 8, 850, 1050}, new int[]{1, 850})).isTrue();
    }

    @Test
    public void doesOuterContainAllElementsOfInner_givenInnerBiggerThanOuter_thenThrowException() throws Exception {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> LoopsCodelabs08.doesOuterContainAllElementsOfInner(new int[]{1, 2}, new int[]{1, 2, 4}));
        assertEquals("Inner cannot be bigger than outer", illegalArgumentException.getMessage());
    }

    @Test
    public void doesOuterContainAllElementsOfInner_givenInnerEmptyAndOuterNotEmpty_thenTrue() throws Exception {
        assertThat(LoopsCodelabs08.doesOuterContainAllElementsOfInner(new int[]{1, 2}, new int[]{})).isTrue();
    }

    @Test
    public void doesOuterContainAllElementsOfInner_givenInnerEmptyAndOuterEmpty_thenTrue() throws Exception {
        assertThat(LoopsCodelabs08.doesOuterContainAllElementsOfInner(new int[]{}, new int[]{})).isTrue();
    }

}
