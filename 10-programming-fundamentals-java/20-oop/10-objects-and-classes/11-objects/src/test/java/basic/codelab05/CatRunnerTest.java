package basic.codelab05;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CatRunnerTest {


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
    public void CatsCorrectlyPrinted() throws Exception {
        CatRunner.main(null);
        Assertions.assertThat(outContent.toString().trim())
                .isEqualToNormalizingNewlines("""
                        I am a cat named Generic cat, have color java.awt.Color[r=0,g=0,b=0] and I'm 99 years old.
                        I am a cat named Garfield, have color java.awt.Color[r=255,g=200,b=0] and I'm 27 years old.
                        I am a cat named Felix, have color java.awt.Color[r=0,g=0,b=0] and I'm 10 years old.
                        I am a cat named Dobby, have color java.awt.Color[r=255,g=0,b=0] and I'm 3 years old.
                        The following cat has won the fight: I am a cat named Felix, have color java.awt.Color[r=0,g=0,b=0] and I'm 10 years old.
                        Dobby says MIAUW!
                        java.awt.Color[r=255,g=200,b=0]
                        Garfield
                        27""");
    }

}
