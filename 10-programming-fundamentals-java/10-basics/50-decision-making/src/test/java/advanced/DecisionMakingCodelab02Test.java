package advanced;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static advanced.DecisionMakingCodelab02.printOutSport;
import static org.assertj.core.api.Assertions.assertThat;

class DecisionMakingCodelab02Test {

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
    void ifProvidingFootballWillPrintOutFootballDescription() {
        printOutSport("Football");
        assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                You have selected Football
                Description: You kick a ball away and then run after it.
                Popularity: 1
                This sport is played with a ball
                This sport is a team sport
                """
        );
    }

    @Test
    void ifProvidingHockeyWillPrintOutHockeyDescription() {
        printOutSport("Hockey");
        assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                You have selected Hockey
                Description: You kick a ball away with a stick and then run after it.
                Popularity: 2
                This sport is played with a ball
                This sport is a team sport
                """
        );
    }

    @Test
    void ifProvidingRugbyWillPrintOutRugbyDescription() {
        printOutSport("Rugby");
        assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                You have selected Rugby
                Description: You run away with a ball and other people try to stop you by ramming you.
                Popularity: 3
                This sport is played with a ball
                This sport is a team sport
                """
        );
    }

    @Test
    void ifProvidingArcheryWillPrintOutArcheryDescription() {
        printOutSport("Archery");
        assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                You have selected Archery
                Description: You try to hit a target with an arrow shot from a bow.
                Popularity: 4
                This sport is not played with a ball
                This sport is not a team sport
                """
        );
    }

    @Test
    void ifProvidingTennisWillPrintOutTennisDescription() {
        printOutSport("Tennis");
        assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                You have selected Tennis
                Description: You hit a ball with a racket over a net, in the hope that the guy on the other side of the net can't do the same.
                Popularity: 2
                This sport is played with a ball
                This sport is not a team sport
                """
        );
    }

    @Test
    void ifProvidingHandballWillPrintOutHandballDescription() {
        printOutSport("Handball");
        assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                You have selected Handball
                Description: You throw a ball away and then run after it.
                Popularity: 4
                This sport is played with a ball
                This sport is a team sport
                """
        );
    }

    @Test
    void ifProvidingOtherSportWillPrintOutOtherSportDescription() {
        printOutSport("Judo");
        assertThat(outContent.toString()).isEqualToNormalizingNewlines("""
                You have selected Judo
                Description: Unknown sport
                Popularity: 3
                This sport is not played with a ball
                This sport is not a team sport
                """
        );
    }

}
