package basic;

import basic.MethodsCodelab08;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodsCodelab08Test {

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
    public void incrementIsCorrectlyCreated() throws Exception {
        assertThat(MethodsCodelab08.class.getDeclaredMethod("increment", int.class)).isNotNull();
        assertThat(MethodsCodelab08.class.getDeclaredMethod("increment", int.class).getReturnType()).isEqualTo(int.class);
    }

    @Test
    public void expressionIsPrinted() throws Exception {
        MethodsCodelab08.main(null);
        assertThat(outContent.toString().toLowerCase().trim()).contains("Value 10 incremented by 1. New value is 11".toLowerCase());
    }

}
