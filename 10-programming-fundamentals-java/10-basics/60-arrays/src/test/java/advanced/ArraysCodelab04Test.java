package advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysCodelab04Test {


    @Test
    public void getLargestSum_returnArrayWithLargestSumOfElements_case1() throws Exception {
        int[] numbers1 = {1, 2, 2};
        int[] numbers2 = {3, 4, 2};
        assertThat(ArraysCodelab04.getLargestSum(numbers1, numbers2)).isEqualTo(numbers2);
    }

    @Test
    public void getLargestSum_returnArrayWithLargestSumOfElements_case2() throws Exception {
        int[] numbers1 = {1, 8, 2};
        int[] numbers2 = {3, 4, 2};
        assertThat(ArraysCodelab04.getLargestSum(numbers1, numbers2)).isEqualTo(numbers1);
    }

    @Test
    public void getLargestSum_returnFirstArrayIfSumOfElementsOfBothArraysIsEqual() throws Exception {
        int[] numbers1 = {1, 8, 2};
        int[] numbers2 = {8, 3, 0};
        assertThat(ArraysCodelab04.getLargestSum(numbers1, numbers2)).isEqualTo(numbers1);
    }

}
