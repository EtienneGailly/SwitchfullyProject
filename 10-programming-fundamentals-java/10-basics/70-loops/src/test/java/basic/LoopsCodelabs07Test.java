package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoopsCodelabs07Test {

    @Test
    public void textRepeatWhile() throws Exception {
        assertThat(LoopsCodelabs07.textRepeatWhile(3, "G")).isEqualTo("GGG");
        assertThat(LoopsCodelabs07.textRepeatWhile(4, "G")).isEqualTo("GGGG");
        assertThat(LoopsCodelabs07.textRepeatWhile(1, "blU")).isEqualTo("blU");
        assertThat(LoopsCodelabs07.textRepeatWhile(2, "xx")).isEqualTo("xxxx");
    }

    @Test
    public void textRepeatWhile_given0TimesToRepeat_returnEmptyString() throws Exception {
        assertThat(LoopsCodelabs07.textRepeatWhile(0, "G")).isEqualTo("");
        assertThat(LoopsCodelabs07.textRepeatWhile(0, "utp")).isEqualTo("");
    }

    @Test
    public void textRepeatWhile_givenNegativeTimesToRepeat_returnErrorText() throws Exception {
        assertThat(LoopsCodelabs07.textRepeatWhile(-5, "G")).isEqualTo("Impossible text repeat");
        assertThat(LoopsCodelabs07.textRepeatWhile(-1, "hello")).isEqualTo("Impossible text repeat");
    }

    @Test
    public void textRepeatDoWhile() throws Exception {
        assertThat(LoopsCodelabs07.textRepeatDoWhile(4, "G")).isEqualTo("GGGG");
        assertThat(LoopsCodelabs07.textRepeatDoWhile(4, "je")).isEqualTo("jejejeje");
        assertThat(LoopsCodelabs07.textRepeatDoWhile(1, "blU")).isEqualTo("blU");
        assertThat(LoopsCodelabs07.textRepeatDoWhile(3, "xx")).isEqualTo("xxxxxx");
    }

    @Test
    public void textRepeatDoWhile_given0TimesToRepeat_returnEmptyString() throws Exception {
        assertThat(LoopsCodelabs07.textRepeatDoWhile(0, "Y")).isEqualTo("");
        assertThat(LoopsCodelabs07.textRepeatDoWhile(0, "utpx")).isEqualTo("");
    }

    @Test
    public void textRepeatDoWhile_givenNegativeTimesToRepeat_returnErrorText() throws Exception {
        assertThat(LoopsCodelabs07.textRepeatDoWhile(-5, "Gt")).isEqualTo("Impossible text repeat");
        assertThat(LoopsCodelabs07.textRepeatDoWhile(-1, "hellow")).isEqualTo("Impossible text repeat");
    }

    @Test
    public void textRepeatFor() throws Exception {
        assertThat(LoopsCodelabs07.textRepeatFor(5, "G")).isEqualTo("GGGGG");
        assertThat(LoopsCodelabs07.textRepeatFor(4, "G")).isEqualTo("GGGG");
        assertThat(LoopsCodelabs07.textRepeatFor(1, "blU")).isEqualTo("blU");
        assertThat(LoopsCodelabs07.textRepeatFor(3, "xx")).isEqualTo("xxxxxx");
    }

    @Test
    public void textRepeatFor_given0TimesToRepeat_returnEmptyString() throws Exception {
        assertThat(LoopsCodelabs07.textRepeatFor(0, "Y")).isEqualTo("");
        assertThat(LoopsCodelabs07.textRepeatFor(0, "utpx")).isEqualTo("");
    }

    @Test
    public void textRepeatFor_givenNegativeTimesToRepeat_returnErrorText() throws Exception {
        assertThat(LoopsCodelabs07.textRepeatFor(-5, "Gt")).isEqualTo("Impossible text repeat");
        assertThat(LoopsCodelabs07.textRepeatFor(-1, "hellow")).isEqualTo("Impossible text repeat");
    }


}
