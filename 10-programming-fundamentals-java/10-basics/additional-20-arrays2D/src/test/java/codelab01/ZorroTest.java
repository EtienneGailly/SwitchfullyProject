package codelab01;

import advanced.codelab01.Zorro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class ZorroTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void createZorroWith5Lines() throws Exception {
        char[][] result = Zorro.generateZ(5);

        assertThat(outContent.toString().trim()).isEqualTo(
                String.format("@@@@@%n") +
                        String.format("   @ %n") +
                        String.format("  @  %n") +
                        String.format(" @   %n") +
                        "@@@@@"
        );
        assertThat(result).isDeepEqualTo(new char[][]{
                new char[]{'@', '@', '@', '@', '@'},
                new char[]{' ', ' ', ' ', '@', ' '},
                new char[]{' ', ' ', '@', ' ', ' '},
                new char[]{' ', '@', ' ', ' ', ' '},
                new char[]{'@', '@', '@', '@', '@'}});
    }

    @Test
    void createZorroWith4Lines() throws Exception {
        char[][] result = Zorro.generateZ(4);

        assertThat(outContent.toString().trim()).isEqualTo(
                String.format("@@@@%n") +
                        String.format("  @ %n") +
                        String.format(" @  %n") +
                        "@@@@"
        );
        assertThat(result).isDeepEqualTo(new char[][]{
                new char[]{'@', '@', '@', '@'},
                new char[]{' ', ' ', '@', ' '},
                new char[]{' ', '@', ' ', ' '},
                new char[]{'@', '@', '@', '@'}});
    }

    @Test
    void createZorroWith3Lines() throws Exception {
        char[][] result = Zorro.generateZ(3);

        assertThat(outContent.toString().trim()).isEqualTo(
                String.format("@@@%n") +
                        String.format(" @ %n") +
                        "@@@"
        );
        assertThat(result).isDeepEqualTo(new char[][]{
                new char[]{'@', '@', '@',},
                new char[]{' ', '@', ' ',},
                new char[]{'@', '@', '@'}});
    }

}
