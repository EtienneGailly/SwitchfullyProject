package advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysCodelab03Test {

    @Test
    public void concatArrays_case1() throws Exception {
        int[] numbers1 = {1, 2};
        int[] numbers2 = {3, 4};
        int[] expected = {1, 2, 3, 4};
        assertThat(ArraysCodelab03.concatArrays(numbers1, numbers2)).isEqualTo(expected);
    }

    @Test
    public void concatArrays_case2() throws Exception {
        int[] numbers1 = {9, 2};
        int[] numbers2 = {3, 3};
        int[] expected = {9, 2, 3, 3};
        assertThat(ArraysCodelab03.concatArrays(numbers1, numbers2)).isEqualTo(expected);
    }

    @Test
    public void concatArrays_givenArrayWithLengthTooSmall_thenReturnFirstArray() throws Exception {
        int[] numbers1 = {1};
        int[] numbers2 = {3, 4};
        assertThat(ArraysCodelab03.concatArrays(numbers1, numbers2)).isEqualTo(numbers1);
    }

    @Test
    public void concatArrays_givenArrayWithLengthTooBig_thenReturnFirstArray() throws Exception {
        int[] numbers1 = {1, 2};
        int[] numbers2 = {3, 4, 5};
        assertThat(ArraysCodelab03.concatArrays(numbers1, numbers2)).isEqualTo(numbers1);
    }

}
