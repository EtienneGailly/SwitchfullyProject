package advanced.codelab01.solutions;

public class FourInARow {


    public static void fillColumn(Board board, int chosenColumn) {
        if(board == null){
            throw new NullPointerException("Board cannot be null");
        }
        for (int i = 0; i < Board.NUMBER_OF_ROWS; i++) {
            board.putTile(chosenColumn, PlayerToken.values()[(i+1) % 2]);
        }
    }
}
