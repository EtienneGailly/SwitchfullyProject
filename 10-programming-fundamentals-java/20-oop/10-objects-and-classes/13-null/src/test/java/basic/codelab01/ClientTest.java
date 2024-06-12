package basic.codelab01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ClientTest {

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
        Client.main(null);

        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                My name is Jim
                I'm going to order a taxi and then let it take me somewhere!
                I am driving to Central Park, NY - Manhattan
                My name is Walter
                I'm going to order another taxi from another company and let it take me somewhere as well
                Looks like there's no taxi available...
                """);
    }
}
