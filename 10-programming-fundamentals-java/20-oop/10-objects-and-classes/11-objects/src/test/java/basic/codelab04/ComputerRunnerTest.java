package basic.codelab04;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ComputerRunnerTest {

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
        ComputerRunner.main(null);

        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                I'm a computer of brand HP and I cost 89900 dollar(cents)
                I'm a computer of brand Sony and I cost 59500 dollar(cents)
                I'm a computer of brand HP and I cost 88800 dollar(cents)
                I'm a computer of brand Apple and I cost 159500 dollar(cents)
                """);
    }
}
