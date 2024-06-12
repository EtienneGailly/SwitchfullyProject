package advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LoopsCodelabs06Test {

    @Test
    public void areScoresAscending() throws Exception {
        assertThat(LoopsCodelabs06.areScoresAscending(new int[]{1,3,5})).isTrue();
        assertThat(LoopsCodelabs06.areScoresAscending(new int[]{1,3,2})).isFalse();
        assertThat(LoopsCodelabs06.areScoresAscending(new int[]{1,5,3})).isFalse();
        assertThat(LoopsCodelabs06.areScoresAscending(new int[]{1,3,5,7,9,11,13})).isTrue();
        assertThat(LoopsCodelabs06.areScoresAscending(new int[]{1,1,1,1,5})).isTrue();
        assertThat(LoopsCodelabs06.areScoresAscending(new int[]{1,1,1,1})).isTrue();
    }

    @Test
    public void areScoresAscending_givenArrayWith1Element_thenThrowException() throws Exception {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> LoopsCodelabs06.areScoresAscending(new int[]{5}));
        assertEquals("The scores argument needs to have at least 2 elements", illegalArgumentException.getMessage());
    }

    @Test
    public void areScoresAscending_givenEmptyArray_thenThrowException() throws Exception {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> LoopsCodelabs06.areScoresAscending(new int[]{}));
        assertEquals("The scores argument needs to have at least 2 elements", illegalArgumentException.getMessage());
    }

}
