package basic.codelab03;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PersonRunnerTest {

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
    void main() {
        PersonRunner.main(null);

        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Hello! My name is Robert and I'm 178cm tall
                Hello! My name is Emma and I'm 180cm tall
                """);
    }
}
