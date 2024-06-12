package advanced.solutions;

import advanced.codelab01.solutions.Board;
import advanced.codelab01.solutions.PlayerToken;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static advanced.codelab01.solutions.Board.NUMBER_OF_COLUMNS;
import static advanced.codelab01.solutions.Board.NUMBER_OF_CONSECUTIVE_TOKENS_TO_WIN;
import static advanced.codelab01.solutions.PlayerToken.PLAYER_1;
import static advanced.codelab01.solutions.PlayerToken.PLAYER_2;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BoardTest {

    @Nested
    @DisplayName("Put a tile")
    class PutATile {
        @Test
        void giveEmptyBoard_whenPutTileInColumn_thenTileIsInColumnOnLowestRow() {
            Board board = new Board();

            board.putTile(4, PLAYER_1);

            assertThat(board.getGrid()[4]).containsExactly(PLAYER_1, null, null, null, null, null);
        }

        @Test
        void givenColumnWithOneTile_whenPutTileInSameColumn_thenTileIsInColumnOnTopOfFirstTile() {
            Board board = new Board();
            board.putTile(4, PLAYER_1);

            board.putTile(4, PLAYER_2);

            assertThat(board.getGrid()[4]).containsExactly(PLAYER_1, PLAYER_2, null, null, null, null);
        }

        @ParameterizedTest
        @ValueSource(ints = {-1, -6, Integer.MIN_VALUE})
        void givenBoard_whenPutTileInNegativeColumn_thenExceptionIsThrown(int columnNumber) {
            Board board = new Board();

            assertThatThrownBy(() -> board.putTile(columnNumber, PLAYER_2))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("There are no negative columns");
        }

        @ParameterizedTest
        @ValueSource(ints = {7, 8, 99, Integer.MAX_VALUE})
        void givenBoard_whenPutTileInTooHighlyNumberedColumn_thenExceptionIsThrown(int columnNumber) {
            Board board = new Board();

            assertThatThrownBy(() -> board.putTile(columnNumber, PLAYER_2))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Maximum column index is 6");
        }

        @Test
        void givenBoard_whenPutNullTile_thenExceptionIsThrown() {
            Board board = new Board();

            assertThatThrownBy(() -> board.putTile(4, null))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Please give a non-null tile");
        }

        @Test
        void givenBoardWithFullColumn_whenPutTileInFullColumn_thenExceptionIsThrown() {
            Board board = new Board();
            for (int i = 0; i < Board.NUMBER_OF_ROWS; i++) {
                board.putTile(4, PLAYER_1);
            }

            assertThatThrownBy(() -> board.putTile(4, PLAYER_1))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Column already full!");
        }
    }

    @Nested
    @DisplayName("Vertical victory")
    class VerticalVictory {
        @ParameterizedTest
        @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6})
        void givenBoardWithColumnWithFourSamePlayerTokensOnBottom_whenCheckWhoWon_thenReturnPlayerToken(int column) {
            Board board = new Board();
            for (int i = 1; i <= NUMBER_OF_CONSECUTIVE_TOKENS_TO_WIN; i++) {
                board.putTile(column, PLAYER_1);
            }

            PlayerToken playerToken = board.checkWhoWon();

            assertThat(playerToken).isEqualTo(PLAYER_1);
        }

        @ParameterizedTest
        @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6})
        void givenBoardWithColumnWithFourSamePlayerTokensOneUpFromBottom_whenCheckWhoWon_thenReturnPlayerToken(int column) {
            Board board = new Board();
            board.putTile(column, PLAYER_2);
            for (int i = 1; i <= NUMBER_OF_CONSECUTIVE_TOKENS_TO_WIN; i++) {
                board.putTile(column, PLAYER_1);
            }

            PlayerToken playerToken = board.checkWhoWon();

            assertThat(playerToken).isEqualTo(PLAYER_1);
        }


        @ParameterizedTest
        @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6})
        void givenBoardWithColumnWithFourSamePlayerTokensTwoUpFromBottom_whenCheckWhoWon_thenReturnPlayerToken(int column) {
            Board board = new Board();
            board.putTile(column, PLAYER_2);
            board.putTile(column, PLAYER_2);
            for (int i = 1; i <= NUMBER_OF_CONSECUTIVE_TOKENS_TO_WIN; i++) {
                board.putTile(column, PLAYER_1);
            }

            PlayerToken playerToken = board.checkWhoWon();

            assertThat(playerToken).isEqualTo(PLAYER_1);
        }

        @ParameterizedTest
        @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6})
        void givenBoardWithColumnWithFourSamePlayerTokensWithOtherTokenInMiddle_whenCheckWhoWon_thenReturnNull(int column) {
            Board board = new Board();
            board.putTile(column, PLAYER_2);
            board.putTile(column, PLAYER_1);
            board.putTile(column, PLAYER_1);
            board.putTile(column, PLAYER_2);
            board.putTile(column, PLAYER_1);
            board.putTile(column, PLAYER_1);
            PlayerToken playerToken = board.checkWhoWon();

            assertThat(playerToken).isEqualTo(null);
        }


        @Nested
        @DisplayName("Horizontal victory")
        class HorizontalVictory {

            private void fillRows(Board board, int numberOfRows) {
                if (numberOfRows == 0) {
                    return;
                }
                for (int row = 0; row < numberOfRows; row++) {
                    for (int col = 0; col < NUMBER_OF_COLUMNS; col++) {
                        board.putTile(col, PlayerToken.values()[(col + row) % 2]);
                        /**
                         * The `PlayerToken.values()[(col + row) % 2]` solution will only work if horizontal victory is checked before diagonal victory.
                         * The reason is that it will produce a checkerboard pattern.
                         * This is a fair assumption, given that checking for horizontal victory is faster (and easier).
                         * If we wanted to be resistant to the case where diagonal is checked first, we would need to devise a better algorithm.
                         */

                    }
                }
            }

            @ParameterizedTest
            @ValueSource(ints = {0, 1, 2, 3, 4, 5})
            void givenBoardWithRowWithFourSamePlayerOnTopOfNRows_whenCheckWhoWon_thenReturnPlayerToken(int numberOfNonWinningRows) {
                Board board = new Board();
                fillRows(board, numberOfNonWinningRows);
                for (int col = 0; col < NUMBER_OF_COLUMNS; col++) {
                    board.putTile(col, PLAYER_1);
                }

                System.out.println(board);
                PlayerToken playerToken = board.checkWhoWon();

                assertThat(playerToken).isEqualTo(PLAYER_1);
            }

            @ParameterizedTest
            @ValueSource(ints = {0, 1, 2, 3, 4, 5})
            void givenBoardWithColumnWithFourSamePlayerTokensOneToTheLeft_whenCheckWhoWon_thenReturnPlayerToken(int numberOfNonWinningRows) {
                Board board = new Board();
                fillRows(board, numberOfNonWinningRows);
                board.putTile(0, PLAYER_2);
                for (int col = 1; col < NUMBER_OF_COLUMNS; col++) {
                    board.putTile(col, PLAYER_1);
                }

                System.out.println(board);
                PlayerToken playerToken = board.checkWhoWon();

                assertThat(playerToken).isEqualTo(PLAYER_1);
            }


            @ParameterizedTest
            @ValueSource(ints = {0, 1, 2, 3, 4, 5})
            void givenBoardWithColumnWithFourSamePlayerTokensTwoToTheLeft_whenCheckWhoWon_thenReturnPlayerToken(int numberOfNonWinningRows) {
                Board board = new Board();
                fillRows(board, numberOfNonWinningRows);
                board.putTile(0, PLAYER_2);
                board.putTile(1, PLAYER_2);
                for (int col = 2; col < NUMBER_OF_COLUMNS; col++) {
                    board.putTile(col, PLAYER_1);
                }

                System.out.println(board);
                PlayerToken playerToken = board.checkWhoWon();

                assertThat(playerToken).isEqualTo(PLAYER_1);
            }

            @ParameterizedTest
            @ValueSource(ints = {0, 1, 2, 3, 4, 5})
            void givenBoardWithRowWithFourSamePlayerTokensWithOtherTokenInMiddle_whenCheckWhoWon_thenReturnNull(int numberOfNonWinningRows) {
                Board board = new Board();
                fillRows(board, numberOfNonWinningRows);
                board.putTile(1, PLAYER_1);
                board.putTile(2, PLAYER_1);
                board.putTile(3, PLAYER_2);
                board.putTile(4, PLAYER_1);
                board.putTile(5, PLAYER_1);
                PlayerToken playerToken = board.checkWhoWon();

                assertThat(playerToken).isEqualTo(null);
            }
        }
    }

    @Nested
    @DisplayName("Diagonal victory")
    class DiagonalVictory {
        // TODO
    }
}