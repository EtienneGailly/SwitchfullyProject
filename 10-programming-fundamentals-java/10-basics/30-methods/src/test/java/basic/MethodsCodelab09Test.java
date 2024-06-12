package basic;

import basic.MethodsCodelab09;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodsCodelab09Test {

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
    public void easyPrintIntIsCorrectlyCreated() throws Exception {
        assertThat(MethodsCodelab09.class.getDeclaredMethod("easyPrint", int.class)).isNotNull();
        assertThat(MethodsCodelab09.class.getDeclaredMethod("easyPrint", int.class).getReturnType()).isEqualTo(void.class);
    }

    @Test
    public void easyPrintStringIsCorrectlyCreated() throws Exception {
        assertThat(MethodsCodelab09.class.getDeclaredMethod("easyPrint", String.class)).isNotNull();
        assertThat(MethodsCodelab09.class.getDeclaredMethod("easyPrint", String.class).getReturnType()).isEqualTo(void.class);
    }

    @Test
    public void easyPrintDoubleIsCorrectlyCreated() throws Exception {
        assertThat(MethodsCodelab09.class.getDeclaredMethod("easyPrint", double.class)).isNotNull();
        assertThat(MethodsCodelab09.class.getDeclaredMethod("easyPrint", double.class).getReturnType()).isEqualTo(void.class);
    }

    @Test
    public void expressionIsPrinted() throws Exception {
        MethodsCodelab09.main(null);
        assertThat(outContent.toString().toLowerCase().trim()).contains("Easy printing value: 105".toLowerCase());
        assertThat(outContent.toString().toLowerCase().trim()).contains("Easy printing value: Mark".toLowerCase());
        assertThat(outContent.toString().toLowerCase().trim()).contains("Easy printing value: 80.45".toLowerCase());
    }

}
