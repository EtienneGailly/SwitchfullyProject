package basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodsCodelab12Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void willPrintOutSeveralPeopleInfo () {
        MethodsCodelab12.main(null);
        int ageJeff = MethodsCodelab12.THIS_YEAR - MethodsCodelab12.BIRTH_YEAR_JEFF;
        int ageSofie = MethodsCodelab12.THIS_YEAR - MethodsCodelab12.BIRTH_YEAR_SOFIE;
        assertThat(outContent.toString()).isEqualToNormalizingNewlines(
                String.format("""
                        ***********************
                        Hi my name is Jef
                        I am %d years old.
                        Which means I am
                        an adult
                        ***********************
                        Hi my name is Sofie
                        I am %d years old.
                        Which means I am
                        not an adult
                        """, ageJeff, ageSofie));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}
