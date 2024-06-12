package basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class LoopsCodelabs04Test {

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
    void simpleArray() {
        LoopsCodelabs04.printOutArray(new String[]{"This", "Is", "Super", "Cool"});

        assertThat(outContent.toString().trim()).isEqualTo(String.format(
                "At index 0 there is: This%n" +
                "At index 1 there is: Is%n" +
                "At index 2 there is: Super%n" +
                "At index 3 there is: Cool%n" +
                        "Thank you for using the print services"));
    }

    @Test
    void emptyArray() {
        LoopsCodelabs04.printOutArray(new String[]{});

        assertThat(outContent.toString().trim()).isEqualTo("Nothing to print");
    }
}
