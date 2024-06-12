package basic.codelab02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static basic.codelab02.Main.getPerson;
import static basic.codelab02.Main.sendLetter;

class MainTest {

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
    void sendLetterToSaskia() {
        sendLetter(getPerson("Saskia"), "someText");

        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Sending letter to: Saskia Declerq
                                
                To be printed on enveloppe:\s
                Saskia Declerq
                Rue de l'hopital 9
                4123 Charleroi
                Belgium
                                
                To be printed on the letter:\s
                someText
                """);
    }

    @Test
    void sendLetterPeter() {
        sendLetter(getPerson("Peter"), "someText");

        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Can not send letter. Person doesn't have an address
                """);
    }

    @Test
    void sendLetterVervaeke() {
        sendLetter(getPerson("Vervaeke"), "someText");

        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Sending letter to: null Vervaeke
                                
                To be printed on enveloppe:\s
                null Vervaeke
                Kerkstraat 12
                1200 Elsene
                Belgium
                                
                To be printed on the letter:\s
                someText
                """);
    }

    @Test
    void sendLetterLouise() {
        sendLetter(getPerson("Louise"), "someText");

        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Can not send letter. Person doesn't have an address
                """);
    }

    @Test
    void sendLetterBenjamin() {
        sendLetter(getPerson("Benjamin"), "someText");

        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                Can not send letter. Person doesn't exist
                """);
    }
}
