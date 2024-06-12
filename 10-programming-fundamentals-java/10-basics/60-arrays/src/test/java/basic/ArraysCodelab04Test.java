package basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ArraysCodelab04Test {

    @Nested
    class FirstElement {
        @Test
        void firstElementWillReturnTheNumberAtIndex() {
            Assertions.assertThat(ArraysCodelab04.firstElement(new int[]{5, 78, 56, 3165, 45})).isEqualTo(5);
        }

        @Test
        void firstElementWillReturnZeroWhenArrayIsEmpty() {
            Assertions.assertThat(ArraysCodelab04.firstElement(new int[]{})).isEqualTo(0);
        }
    }

    @Nested
    class SumOfFirstAndSecondElement {
        @Test
        void sumOfFirstAndSecondElementWillReturnTheNumberAtIndex() {
            Assertions.assertThat(ArraysCodelab04.sumOfFirstAndSecondElement(new int[]{5, 78, 56, 3165, 45})).isEqualTo(83);
        }

        @Test
        void sumOfFirstAndSecondElementWillReturnZeroWhenArrayIsEmpty() {
            Assertions.assertThat(ArraysCodelab04.sumOfFirstAndSecondElement(new int[]{})).isEqualTo(0);
        }

        @Test
        void sumOfFirstAndSecondElementWillReturnZeroWhenArrayHasOnlyOneElement() {
            Assertions.assertThat(ArraysCodelab04.sumOfFirstAndSecondElement(new int[]{1})).isEqualTo(0);
        }
    }

    @Nested
    class ElementAtIndex {
        @Test
        void elementAtIndexGiven4WillReturnTheNumberAtIndex4() {
            Assertions.assertThat(ArraysCodelab04.elementAtIndex(4, new int[]{5, 78, 56, 3165, 45})).isEqualTo(45);
        }

        @Test
        void elementAtIndexWillReturnZeroWhenIndexIsNegative() {
            Assertions.assertThat(ArraysCodelab04.elementAtIndex(-1, new int[]{5, 78, 56, 3165, 45})).isEqualTo(0);
        }

        @Test
        void elementAtIndexWillReturnZeroWhenIndexIsBiggerThanArraySize() {
            Assertions.assertThat(ArraysCodelab04.elementAtIndex(10, new int[]{5, 78, 56, 3165, 45})).isEqualTo(0);
        }
    }

    @Nested
    class SumOfElementAtIndexAndNextElement {
        @Test
        void sumOfElementAtIndexAndNextElementGiven3WillReturnTheNumberAtIndex3PlusTheNumberAtIndex4() {
            Assertions.assertThat(ArraysCodelab04.sumOfElementAtIndexAndNextElement(3, new int[]{5, 78, 56, 3165, 45})).isEqualTo(3210);
        }

        @Test
        void sumOfElementAtIndexAndNextElementGivenNegativeNumberWillReturn0() {
            Assertions.assertThat(ArraysCodelab04.sumOfElementAtIndexAndNextElement(-1, new int[]{5, 78, 56, 3165, 45})).isEqualTo(0);
        }

        @Test
        void sumOfElementAtIndexAndNextElementGivenIndexEqualOrLargerThanTheLengthOfTheArrayMinusOneThenReturnZero() {
            Assertions.assertThat(ArraysCodelab04.sumOfElementAtIndexAndNextElement(4, new int[]{5, 78, 56, 3165, 45})).isEqualTo(0);
        }
    }
}
