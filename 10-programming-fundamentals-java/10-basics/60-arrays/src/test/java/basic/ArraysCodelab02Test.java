package basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArraysCodelab02Test {

    @Test
    void createArrayCreatesAnArrayThatHasLength10() {
        Assertions.assertThat(ArraysCodelab02.createArray())
                .hasSize(10)
                .containsExactly(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    @Test
    void fillArrayWillFillArrayWithNumbers1To10() {
        int[] start = ArraysCodelab02.createArray();
        int[] array = ArraysCodelab02.fillArray(start);

        Assertions.assertThat(start).isEqualTo(array);
        Assertions.assertThat(array).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    void createAndFillArrayWithLetterAToK() {
        Assertions.assertThat(ArraysCodelab02.createAndFillArray()).containsExactly("a","b","c","d","e","f","g","h","i","j","k");
    }
}
