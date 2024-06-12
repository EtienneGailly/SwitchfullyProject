package basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LoopsCodelabs02Test {

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
    void giveTicket() {
        LoopsCodelabs02.giveTicket(4);
        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Ticket
                Ticket
                Ticket
                Ticket
                """);
    }

    @Test
    void giveCoke() {
        LoopsCodelabs02.giveCoke(4);
        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Giving a Coke
                Giving a Coke
                """);
    }

    @Test
    void increaseTemperature() {
        LoopsCodelabs02.increaseTemperature(0);
        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Temperature has been increased by one. The new temperature is now 1
                Temperature has been increased by one. The new temperature is now 2
                Temperature has been increased by one. The new temperature is now 3
                Temperature has been increased by one. The new temperature is now 4
                Temperature has been increased by one. The new temperature is now 5
                Temperature has been increased by one. The new temperature is now 6
                Temperature has been increased by one. The new temperature is now 7
                Temperature has been increased by one. The new temperature is now 8
                Temperature has been increased by one. The new temperature is now 9
                Temperature has been increased by one. The new temperature is now 10
                Temperature has been increased by one. The new temperature is now 11
                Temperature has been increased by one. The new temperature is now 12
                Temperature has been increased by one. The new temperature is now 13
                Temperature has been increased by one. The new temperature is now 14
                Temperature has been increased by one. The new temperature is now 15
                Temperature has been increased by one. The new temperature is now 16
                Temperature has been increased by one. The new temperature is now 17
                Temperature has been increased by one. The new temperature is now 18
                Temperature has been increased by one. The new temperature is now 19
                Temperature has been increased by one. The new temperature is now 20
                Temperature has been increased by one. The new temperature is now 21
                Temperature has been increased by one. The new temperature is now 22
                """);
    }
}
