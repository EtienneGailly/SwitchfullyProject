package basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoopsCodelabs01Test {
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
    void repeatWithWhile() {
        LoopsCodelabs01.repeatWithWhile();
        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Hello!
                Hello!
                Hello!
                Hello!
                Hello!
                Finished
                """);
    }

    @Test
    void repeatWithFor() {
        LoopsCodelabs01.repeatWithFor();
        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Hello!
                Hello!
                Hello!
                Hello!
                Hello!
                Finished
                """);
    }

    @Test
    void repeatWithStream() {
        LoopsCodelabs01.repeatWithStream();
        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Hello!
                Hello!
                Hello!
                Hello!
                Hello!
                Finished
                """);
    }

    @Test
    void loopHard() {
        LoopsCodelabs01.loopHard();
        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Hello!
                Hello!
                Hello!
                Hello!
                Hello!
                Hello!
                Hello!
                Hello!
                Hello!
                Hello!
                Finished
                """);
    }
}
