package basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodsCodelab11Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void willPrintOutSeveralTemperatureConversions() {
        MethodsCodelab11.main(null);
        assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                It's 14.0°F outside which is -10.0°C
                It's 32.0°F outside which is 0.0°C
                It's 50.0°F outside which is 10.0°C
                It's 68.0°F outside which is 20.0°C
                It's 86.0°F outside which is 30.0°C
                """);
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}
