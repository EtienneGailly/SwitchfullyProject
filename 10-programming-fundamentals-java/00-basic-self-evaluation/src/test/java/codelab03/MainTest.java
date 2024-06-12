package codelab03;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void arrayForSize2() {
        Assertions.assertThat(Main.createArrayForSize(2)).isDeepEqualTo(new char[][]{
                new char[]{'@', '@'},
                new char[]{'@', '@'}});
    }

    @Test
    void arrayForSize3() {
        Assertions.assertThat(Main.createArrayForSize(3)).isDeepEqualTo(new char[][]{
                new char[]{'@', '@', '@'},
                new char[]{'@', ' ', '@'},
                new char[]{'@', '@', '@'}});
    }

    @Test
    void arrayForSize4() {
        Assertions.assertThat(Main.createArrayForSize(4)).isDeepEqualTo(new char[][]{
                new char[]{'@', '@', '@', '@'},
                new char[]{'@', ' ', ' ', '@'},
                new char[]{'@', ' ', ' ', '@'},
                new char[]{'@', '@', '@', '@'}});
    }

    @Test
    void arrayForSize5() {
        Assertions.assertThat(Main.createArrayForSize(5)).isDeepEqualTo(new char[][]{
                new char[]{'@', '@', '@', '@', '@'},
                new char[]{'@', ' ', ' ', ' ', '@'},
                new char[]{'@', ' ', ' ', ' ', '@'},
                new char[]{'@', ' ', ' ', ' ', '@'},
                new char[]{'@', '@', '@', '@', '@'}});
    }

}
