package basic;

import basic.MethodsCodelab05;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MethodsCodelab05Test {

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
    public void get5IsCorrectlyCreated() throws Exception {
        assertThat(MethodsCodelab05.class.getDeclaredMethod("get5")).isNotNull();
        assertThat(MethodsCodelab05.class.getDeclaredMethod("get5").getReturnType()).isEqualTo(int.class);
    }

    @Test
    public void get5isPrinted() throws Exception {
        MethodsCodelab05.main(null);
        assertEquals("5", outContent.toString().toLowerCase().trim());
    }

}
