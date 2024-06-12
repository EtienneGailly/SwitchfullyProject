package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class LoopsCodelabs04Test {

    @Test
    public void getElementsAfter4() throws Exception {
        Assertions.assertThat(LoopsCodelabs04.getElementsAfter4(new int[]{2, 4, 1, 2})).isEqualTo(new int[]{1, 2});
        Assertions.assertThat(LoopsCodelabs04.getElementsAfter4(new int[]{4, 1, 4, 8})).isEqualTo(new int[]{8});
        Assertions.assertThat(LoopsCodelabs04.getElementsAfter4(new int[]{4, 4, 1, 1, 3})).isEqualTo(new int[]{1, 1, 3});
        Assertions.assertThat(LoopsCodelabs04.getElementsAfter4(new int[]{4, 4, 4, 1, 4, 5, 6, 7})).isEqualTo(new int[]{5, 6, 7});
    }

    @Test
    public void getElementsAfter4_givenNo4_returnArrayWith4() throws Exception {
        Assertions.assertThat(LoopsCodelabs04.getElementsAfter4(new int[]{2, 2, 1, 8})).isEqualTo(new int[]{4});
    }

    @Test
    public void getElementsAfter4_givenEmptyArray_returnArrayWith4() throws Exception {
        Assertions.assertThat(LoopsCodelabs04.getElementsAfter4(new int[]{})).isEqualTo(new int[]{4});
    }

}
