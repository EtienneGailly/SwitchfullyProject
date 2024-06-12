package basic;

import basic.MethodsCodelab06;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;


public class MethodsCodelab06Test {

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
    public void addIsCorrectlyCreated() throws Exception {
        assertThat(MethodsCodelab06.class.getDeclaredMethod("add", double.class, double.class)).isNotNull();
        assertThat(MethodsCodelab06.class.getDeclaredMethod("add", double.class, double.class).getReturnType()).isEqualTo(double.class);
    }

    @Test
    public void addIsPrinted() throws Exception {
        MethodsCodelab06.main(null);
        assertThat(outContent.toString().toLowerCase().trim()).isEqualTo("90.52");
    }

}
