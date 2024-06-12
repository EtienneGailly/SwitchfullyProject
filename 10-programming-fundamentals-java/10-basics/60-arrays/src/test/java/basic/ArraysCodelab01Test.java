package basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ArraysCodelab01Test {

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
    void printOutThirdElementWillPrintOutThirdElementForInts() {
        ArraysCodelab01.printOutThirdElement(new String[]{"I","am","legend"});
        Assertions.assertThat(outContent.toString().trim()).isEqualTo("legend");
    }

    @Test
    void printOutFifthElementWillPrintOutThirdElementForInts() {
        ArraysCodelab01.printOutFifthElement(new String[]{"do","re","mi","fa","sol","la","si"});
        Assertions.assertThat(outContent.toString().trim()).isEqualTo("sol");
    }

}
