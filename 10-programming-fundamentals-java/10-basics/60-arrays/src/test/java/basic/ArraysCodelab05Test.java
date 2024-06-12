package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysCodelab05Test {

    @Test
    public void replaceThirdWord_replaceElementOnIndex2WithProvidedWord_case1() throws Exception {
        String[] words = {"I", "really", "need", "that", "solution"};
        String[] expected = {"I", "really", "nailed", "that", "solution"};
        assertThat(ArraysCodelab05.replaceThirdWord(words, "nailed")).isEqualTo(expected);
    }

    @Test
    public void replaceThirdWord_replaceElementOnIndex2WithProvidedWord_case2() throws Exception {
        String[] words = {"I", "really", "really"};
        String[] expected = {"I", "really", "holalala la la"};
        assertThat(ArraysCodelab05.replaceThirdWord(words, "holalala la la")).isEqualTo(expected);
    }

    @Test
    public void replaceThirdWord_givenArrayWithFewerThan2Elements_thenReturnArray_case1() throws Exception {
        String[] words = {"I", "really"};
        assertThat(ArraysCodelab05.replaceThirdWord(words, "test123")).isEqualTo(words);
    }

    @Test
    public void replaceThirdWord_givenArrayWithFewerThan2Elements_thenReturnArray_case2() throws Exception {
        String[] words = {"I"};
        assertThat(ArraysCodelab05.replaceThirdWord(words, "test123")).isEqualTo(words);
    }

    @Test
    public void replaceThirdWord_givenArrayWithFewerThan2Elements_thenReturnArray_case3() throws Exception {
        String[] words = {};
        assertThat(ArraysCodelab05.replaceThirdWord(words, "test123")).isEqualTo(words);
    }

}
