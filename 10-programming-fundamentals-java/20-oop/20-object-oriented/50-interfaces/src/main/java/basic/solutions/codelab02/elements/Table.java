package basic.solutions.codelab02.elements;

import basic.solutions.codelab02.Downloadable;

import java.util.Arrays;
import java.util.Objects;

public class Table implements Downloadable {

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

    @Override
    public String download() {
        String result = "";
        for (String[] row : cells) {
            for (String column : row) {
                result += "|" + Objects.requireNonNullElse(column, " ");
            }
            result += "|\n";
        }
        return result;
    }
}
