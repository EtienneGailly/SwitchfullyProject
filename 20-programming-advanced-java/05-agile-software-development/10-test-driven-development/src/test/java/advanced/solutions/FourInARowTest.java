package advanced.solutions;

import advanced.codelab01.solutions.Board;
import advanced.codelab01.solutions.FourInARow;
import org.junit.jupiter.api.Test;

import static advanced.codelab01.solutions.PlayerToken.PLAYER_1;
import static advanced.codelab01.solutions.PlayerToken.PLAYER_2;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FourInARowTest {

    @Test
    void givenNoBoard_whenFillColumn_thenExceptionIsThrown() {
        Board board = null;

        assertThatThrownBy(() -> FourInARow.fillColumn(board, 2))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("Board cannot be null");
    }

    @Test
    void givenBoard_whenFillColumn_thenColumnIsFilledWithAlternatingTokensOfPlayer() {
        Board board = new Board();

        FourInARow.fillColumn(board, 4);

        assertThat(board.getGrid()[4]).containsExactly(PLAYER_2, PLAYER_1, PLAYER_2, PLAYER_1, PLAYER_2, PLAYER_1);
    }
}
