package basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ArraysCodelab03Test {

    @Nested
    @DisplayName("get size")
    class GetSize {
        @Test
        void returnsTheSizeOfTheInputArray() {
            Assertions.assertThat(ArraysCodelab03.getSize(new int[]{1, 2})).isEqualTo(2);
            Assertions.assertThat(ArraysCodelab03.getSize(new int[]{4, 3})).isEqualTo(2);
            Assertions.assertThat(ArraysCodelab03.getSize(new int[]{1, 2, 3, 7})).isEqualTo(4);
            Assertions.assertThat(ArraysCodelab03.getSize(new int[]{})).isEqualTo(0);
        }
    }

    @Nested
    @DisplayName("get element at")
    class GetElementAt {
        @Test
        void getElementAtWillReturnTheElementFoundAtIndexInTheArray() {
            Assertions.assertThat(ArraysCodelab03.getElementAt(0, new int[]{7854, 253, 456})).isEqualTo(7854);
            Assertions.assertThat(ArraysCodelab03.getElementAt(1, new int[]{7854, 253, 456})).isEqualTo(253);
            Assertions.assertThat(ArraysCodelab03.getElementAt(2, new int[]{7854, 253, 456})).isEqualTo(456);
        }

        @Test
        void getElementAtWillReturnZeroWhenIndexIsNegative() {
            Assertions.assertThat(ArraysCodelab03.getElementAt(-1, new int[]{7854, 253, 456})).isEqualTo(0);
        }

        @Test
        void getElementAtWillReturnZeroWhenIndexIsEqualOrBiggerThanArraySize() {
            Assertions.assertThat(ArraysCodelab03.getElementAt(3, new int[]{7854, 253, 456})).isEqualTo(0);
            Assertions.assertThat(ArraysCodelab03.getElementAt(4, new int[]{7854, 253, 456})).isEqualTo(0);
        }
    }

    @Nested
    @DisplayName("get element at real index")
    class GetElementAtRealIndex {
        @Test
        void getElementAtRealIndexGivenIndex5WillReturnThe5thElement() {
            Assertions.assertThat(ArraysCodelab03.getElementAtRealIndex(3, new int[]{34, 56, 21})).isEqualTo(21);
        }

        @Test
        void getElementAtRealIndexReturn0WhenIndexIsZeroOrLower() {
            Assertions.assertThat(ArraysCodelab03.getElementAtRealIndex(0, new int[]{34, 56, 21})).isEqualTo(0);
        }

        @Test
        void getElementAtRealIndexReturn0WhenIndexIsBiggerThanTheArraySize() {
            Assertions.assertThat(ArraysCodelab03.getElementAtRealIndex(4, new int[]{34, 56, 21})).isEqualTo(0);
        }
    }

    @Nested
    @DisplayName("get element at sum of index")
    class GetElementAtSumOfIndexes {
        @Test
        void getElementAtSumOfIndexesWillReturnTheElementFoundAtTheSumOfTheTwoIndexInArray() {
            Assertions.assertThat(ArraysCodelab03.getElementAtSumOfIndexes(2, 2, new int[]{1, 2, 3, 4, 5, 6})).isEqualTo(5);
            Assertions.assertThat(ArraysCodelab03.getElementAtSumOfIndexes(-1, 1, new int[]{1, 2, 3, 4, 5, 6})).isEqualTo(1);
        }

        @Test
        void getElementAtSumOfIndexesWillReturnZeroWhenSumOfIndexesAreNegative() {
            Assertions.assertThat(ArraysCodelab03.getElementAtSumOfIndexes(-1, -2, new int[]{7854, 253, 456})).isEqualTo(0);
        }

        @Test
        void getElementAtSumOfIndexesWillReturnZeroWhenSumOfIndexesIsEqualOrBiggerThanArraySize() {
            Assertions.assertThat(ArraysCodelab03.getElementAtSumOfIndexes(3, 4, new int[]{7854, 253, 456})).isEqualTo(0);
        }
    }
}
