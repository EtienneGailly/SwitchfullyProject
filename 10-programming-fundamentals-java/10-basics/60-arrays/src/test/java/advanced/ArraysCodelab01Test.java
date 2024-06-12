package advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysCodelab01Test {

    @Test
    public void firstOrLast6() throws Exception {
        int[] numbers = {1,2,3,4,5,6};
        int[] numbers2 = {6,4,5,6};
        int[] numbers3 = {6,2,3,5,1};
        int[] numbers4 = {6};
        int[] numbers5 = {5,2,3,5,1};
        int[] numbers6 = {4};

        assertThat(ArraysCodelab01.firstOrLast6(numbers)).isTrue();
        assertThat(ArraysCodelab01.firstOrLast6(numbers2)).isTrue();
        assertThat(ArraysCodelab01.firstOrLast6(numbers3)).isTrue();
        assertThat(ArraysCodelab01.firstOrLast6(numbers4)).isTrue();
        assertThat(ArraysCodelab01.firstOrLast6(numbers5)).isFalse();
        assertThat(ArraysCodelab01.firstOrLast6(numbers6)).isFalse();

    }

}
