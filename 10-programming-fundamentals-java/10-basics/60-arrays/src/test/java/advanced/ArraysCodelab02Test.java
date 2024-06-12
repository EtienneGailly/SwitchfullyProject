package advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ArraysCodelab02Test {

    @Test
    public void takeMiddleElements_case1() throws Exception {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 5, 6};
        int[] expected = {2, 5};
        assertThat(ArraysCodelab02.takeMiddleElements(numbers1, numbers2)).isEqualTo(expected);
    }

    @Test
    public void takeMiddleElements_case2() throws Exception {
        int[] numbers1 = {7, 7, 7};
        int[] numbers2 = {3, 2, 0};
        int[] expected = {7, 2};
        assertThat(ArraysCodelab02.takeMiddleElements(numbers1, numbers2)).isEqualTo(expected);
    }

}
