package basic.codelab02.elements;

import java.util.Arrays;

public class Table {

    private final int rows;
    private final int columns;
    private final String[][] cells;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        cells = new String[rows][columns];
    }

    public void insertInCell(int row, int column, String cellData) {
        cells[row][column] = cellData;
    }

    @Override
    public String toString() {
        return "Table{" +
                "rows=" + rows +
                ", columns=" + columns +
                ", cells=" + Arrays.toString(cells) +
                '}';
    }
}
