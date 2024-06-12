package advanced.codelab01.solutions;

import java.util.Arrays;

import static java.util.Objects.isNull;

/**
 * We don't want to work directly with Tile[][] or with PlayerToken[][] matrices.
 * Why? Because we always would constantly have to verify that the dimensions are 7x6
 * and that the dimensions are respected. All of these *invariables* can best be *encapsulated*
 * by putting this matrix in a class Board. This class Board is where all the logic of our
 * board, like relating to putting tiles and verifying dimensions will be put.
 */
public class Board {

    public static final int NUMBER_OF_COLUMNS = 7;
    public static final int NUMBER_OF_ROWS = 6;

    public static final int NUMBER_OF_CONSECUTIVE_TOKENS_TO_WIN = 4;

    // grid is final, but that actually only refers to the reference. The content of the grid can change.
    private final PlayerToken[][] grid;

    public Board() {
        this.grid = new PlayerToken[NUMBER_OF_COLUMNS][NUMBER_OF_ROWS];
    }

    public void putTile(int chosenColumn, PlayerToken givenTile) {
        if (chosenColumn < 0) {
            throw new IllegalArgumentException("There are no negative columns");
        }
        if (chosenColumn > 6) {
            throw new IllegalArgumentException("Maximum column index is 6");
        }
        if (givenTile == null) {
            throw new IllegalArgumentException("Please give a non-null tile");
        }
        if (grid[chosenColumn][NUMBER_OF_ROWS - 1] != null) {
            throw new IllegalArgumentException("Column already full!");
        }

        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
            if (isNull(grid[chosenColumn][row])) {
                grid[chosenColumn][row] = givenTile;
                break;
            }
        }
    }

    /**
     * @return PlayerToken if victor, else *null*
     */
    public PlayerToken checkWhoWon() {
        PlayerToken verticalVictor = checkForAnyColumnVictory();
        if (verticalVictor != null) return verticalVictor;

        PlayerToken horizontalVictor = checkForAnyRowVictory();
        if (horizontalVictor != null) return horizontalVictor;

        // TODO diagonalVictory
        return null;
    }


    private PlayerToken checkForAnyRowVictory() {
        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
            PlayerToken horizontalVictor = checkForRowVictory(row);
            if(horizontalVictor != null) {
                return horizontalVictor;
            }
        }
        return null;
    }

    private PlayerToken checkForRowVictory(int chosenRow) {
        PlayerToken currentPlayerBeingChecked = grid[0][chosenRow];
        int consecutiveTokens = 0;
        for (int col = 0; col < NUMBER_OF_COLUMNS; col++) {
            PlayerToken currentTile = grid[col][chosenRow];
            if (currentTile == null) {
                consecutiveTokens = 0;
            } else if(currentTile == currentPlayerBeingChecked) {
                consecutiveTokens++;
            } else {
                consecutiveTokens = 1;
            }

            if(consecutiveTokens == 4){
                return currentPlayerBeingChecked;
            }
            currentPlayerBeingChecked = currentTile;
        }

        return null;
    }

    private PlayerToken checkForAnyColumnVictory() {
        for (int col = 0; col < NUMBER_OF_COLUMNS; col++) {
            PlayerToken verticalVictor = checkForColumnVictory(col);
            if(verticalVictor != null) {
                return verticalVictor;
            }
        }
        return null;
    }

    private PlayerToken checkForColumnVictory(int column) {
        PlayerToken currentPlayerBeingChecked = grid[column][0];
        int consecutiveTokens = 0;
        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
            PlayerToken currentTile = grid[column][row];
            if (currentTile == null) {
                consecutiveTokens = 0;
            } else if(currentTile == currentPlayerBeingChecked) {
                consecutiveTokens++;
            } else {
                consecutiveTokens = 1;
            }

            if(consecutiveTokens == 4){
                return currentPlayerBeingChecked;
            }
            currentPlayerBeingChecked = currentTile;
        }
        return null;
    }

    /**
     * This method is not necessary, but useful for debugging.
     */
    @Override
    public String toString() {
        return Arrays.deepToString(getGrid()).replace("], ", "]\n");
    }

    /**
     * Why return a copy of grid? So that nobody who uses this getter can modify the content!
     * @return a *copy* of the grid.
     */
    public PlayerToken[][] getGrid() {
        PlayerToken[][] newGrid = new PlayerToken[NUMBER_OF_COLUMNS][NUMBER_OF_ROWS];
        for (int col = 0; col < NUMBER_OF_COLUMNS; col++) {
            newGrid[col] = Arrays.copyOf(grid[col], NUMBER_OF_ROWS);
        }
        return newGrid;
    }
}
