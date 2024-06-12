package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LoopsCodelabs01Test {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void triangleOfLengthZero() {
        LoopsCodelabs01.triangle(0);

        Assertions.assertThat(outContent.toString()).isEqualTo("");
    }

    @Test
    void triangleOfLengthOne() {
        LoopsCodelabs01.triangle(1);

        Assertions.assertThat(outContent.toString()).isEqualTo(String.format("*%n"));
    }

    @Test
    void triangleOfLengthTwo() {
        LoopsCodelabs01.triangle(2);

        Assertions.assertThat(outContent.toString()).isEqualTo(String.format("*%n**%n"));
    }

    @Test
    void triangleOfLengthFour() {
        LoopsCodelabs01.triangle(4);

        Assertions.assertThat(outContent.toString()).isEqualTo(String.format("*%n**%n***%n****%n"));
    }
}
