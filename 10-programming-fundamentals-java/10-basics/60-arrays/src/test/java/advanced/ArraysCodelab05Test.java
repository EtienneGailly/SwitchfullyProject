package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArraysCodelab05Test {

    @Test
    void replaceElementAtIndexWithWillReplaceTheElementAtIndexWithReplacementInArray() {
        Assertions.assertThat(ArraysCodelab05.replaceElementAtIndexWith(3, "phrase", new String[]{"I", "am", "a", "sentence", "for", "a", "test"}))
                .containsExactly("I", "am", "a", "phrase", "for", "a", "test");
    }

    @Test
    void replaceElementAtIndexWithWillDoNothingIfIndexIsNegative() {
        Assertions.assertThat(ArraysCodelab05.replaceElementAtIndexWith(-1, "phrase", new String[]{"I", "am", "a", "sentence", "for", "a", "test"}))
                .containsExactly("I", "am", "a", "sentence", "for", "a", "test");
    }

    @Test
    void replaceElementAtIndexWithWillDoNothingIfIndexIsEqualOrBiggerThanArraySize() {
        Assertions.assertThat(ArraysCodelab05.replaceElementAtIndexWith(7, "phrase", new String[]{"I", "am", "a", "sentence", "for", "a", "test"}))
                .containsExactly("I", "am", "a", "sentence", "for", "a", "test");
        Assertions.assertThat(ArraysCodelab05.replaceElementAtIndexWith(8, "phrase", new String[]{"I", "am", "a", "sentence", "for", "a", "test"}))
                .containsExactly("I", "am", "a", "sentence", "for", "a", "test");
    }


    @Test
    void switchElementsWillSwitchElementAtIndex1WithElementAtIndex2() {
        Assertions.assertThat(ArraysCodelab05.swapElements(1, 2, new String[]{"I", "am", "a", "sentence", "for", "a", "test"}))
                .containsExactly("I", "a", "am", "sentence", "for", "a", "test");
    }

    @Test
    void switchElementsWillDoNothingIfEitherIndex1OrIndex2IsNegative() {
        Assertions.assertThat(ArraysCodelab05.swapElements(-1, 2, new String[]{"I", "am", "a", "sentence", "for", "a", "test"}))
                .containsExactly("I", "am", "a", "sentence", "for", "a", "test");

        Assertions.assertThat(ArraysCodelab05.swapElements(1, -2, new String[]{"I", "am", "a", "sentence", "for", "a", "test"}))
                .containsExactly("I", "am", "a", "sentence", "for", "a", "test");
    }

    @Test
    void switchElementsWillDoNothingIfEitherIndex1OrIndex2IsEqualOrBiggerThanArraySize() {
        Assertions.assertThat(ArraysCodelab05.swapElements(7, 2, new String[]{"I", "am", "a", "sentence", "for", "a", "test"}))
                .containsExactly("I", "am", "a", "sentence", "for", "a", "test");

        Assertions.assertThat(ArraysCodelab05.swapElements(1, 7, new String[]{"I", "am", "a", "sentence", "for", "a", "test"}))
                .containsExactly("I", "am", "a", "sentence", "for", "a", "test");
    }

}
