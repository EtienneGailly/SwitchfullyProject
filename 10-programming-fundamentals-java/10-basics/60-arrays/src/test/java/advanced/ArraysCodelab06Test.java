package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArraysCodelab06Test {

    @Test
    void enlargeWillCreateABiggerArrayWithTheSameElementsButOfSize10() {
        Assertions.assertThat(ArraysCodelab06.enlarge(new int[]{8, 9})).containsExactly(8, 9, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    @Test
    void enlargeWillReturnTheInputArrayIfItIsNotOfSize2() {
        Assertions.assertThat(ArraysCodelab06.enlarge(new int[]{8, 9, 4})).containsExactly(8, 9, 4);
    }

    @Test
    void enlargeFromTheFrontWillCreateABiggerArrayWithTheSameElementsButOfSize10() {
        Assertions.assertThat(ArraysCodelab06.enlargeFromTheFront(new int[]{8, 9})).containsExactly(0, 0, 0, 0, 0, 0, 0, 0, 8, 9);
    }

    @Test
    void enlargeFromTheFrontWillReturnTheInputArrayIfItIsNotOfSize2() {
        Assertions.assertThat(ArraysCodelab06.enlargeFromTheFront(new int[]{8, 9, 4})).containsExactly(8, 9, 4);
    }
}
