package basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodsCodelab10Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void willPrintOutSeveralRevolvesMessages() {
        MethodsCodelab10.main(null);
        assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Earth revolves around the sun
                Mars revolves around the sun
                Mercury revolves around the sun
                Venus revolves around the sun
                """);
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}
