package basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoopsCodelabs03Test {

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
        LoopsCodelabs03.main(null);
        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Happy Birthday Sophie!
                You're today 10 years old!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Happy Birthday Jef!
                You're today 7 years old!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                Hip Hip Hooray!
                """);
    }
}
