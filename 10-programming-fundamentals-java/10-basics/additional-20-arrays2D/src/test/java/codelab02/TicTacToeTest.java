package codelab02;

import advanced.codelab02.TicTacToe;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class TicTacToeTest {

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
    void ticTacToe_WinForPlayerX_StraightLine() throws Exception {
        TicTacToe.checkWin(new char[][]{{'X', 'X', 'X'}, {'O', 'O', ' '}, {' ', ' ', ' '}});

        assertThat(outContent.toString().trim()).isEqualTo("Player X has won the game.");
    }

    @Test
    void ticTacToe_WinForPlayerO_StraightLineDown() throws Exception {
        TicTacToe.checkWin(new char[][]{{'O', 'X', 'X'}, {'O', 'X', ' '}, {'O', ' ', ' '}});

        assertThat(outContent.toString().trim()).isEqualTo("Player O has won the game.");
    }

    @Test
    void ticTacToe_WinForPlayerO_DiagonalLine() throws Exception {
        TicTacToe.checkWin(new char[][]{{'O', 'X', 'X'}, {'X', 'O', ' '}, {' ', ' ', 'O'}});

        assertThat(outContent.toString().trim()).isEqualTo("Player O has won the game.");
    }

    @Test
    void ticTacToe_NoOneWins() throws Exception {
        TicTacToe.checkWin(new char[][]{{'O', 'X', 'X'}, {'X', 'X', 'O'}, {'O', 'O', 'X'}});

        assertThat(outContent.toString().trim()).isEqualTo("No one has won the game.");
    }

}
