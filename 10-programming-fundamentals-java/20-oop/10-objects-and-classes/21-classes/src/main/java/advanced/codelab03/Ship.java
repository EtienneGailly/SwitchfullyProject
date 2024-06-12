package advanced.codelab03;

import java.util.Arrays;

public class Ship {
    private final String name;
    private int significantXCoordinate;
    private int significantYCoordinate;
    private boolean isHorizontal;
    private final int length;
    private int[][] positions;

    private static final int DEFAULT_X_COORDINATE = 0;
    private static final int DEFAULT_Y_COORDINATE = 0;
    private static final boolean DEFAULT_HORIZONTALITY = true;


    public Ship(String name, int xCoordinate, int yCoordinate, boolean isHorizontal) {
        this.name = name;
        this.significantXCoordinate = xCoordinate;
        this.significantYCoordinate = yCoordinate;
        this.length = convertNameToLength(name);
        this.isHorizontal = isHorizontal;
    }

    public Ship(String name) {
        this(name, DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE, DEFAULT_HORIZONTALITY);
    }

    public int convertNameToLength(String name) {
        return switch (name) {
            case "Carrier" -> 5;
            case "Battleship" -> 4;
            case "Destroyer", "Submarine" -> 3;
            case "Patrol Boat" -> 2;
            default -> throw new IllegalArgumentException("Invalid ship name: " + name);
        };
    }

    public int[][] buildPositions() {
        positions = new int[length][2];
        for (int i = 0; i < length; i++) {
            if (isHorizontal) {
                positions[i][0] = significantXCoordinate+i;
                positions[i][1] = significantYCoordinate;
            }
            else {
                positions[i][0] = significantXCoordinate;
                positions[i][1] = significantYCoordinate+i;
            }
        }
        return positions;
    }

    public int getLength() {
        return length;
    }

    public int[][] getPositions() {
        return positions;
    }

    public boolean isHorizontal() {
        return isHorizontal;
    }

    public void setSignificantXCoordinate(int significantXCoordinate) {
        this.significantXCoordinate = significantXCoordinate;
    }

    public void setSignificantYCoordinate(int significantYCoordinate) {
        this.significantYCoordinate = significantYCoordinate;
    }

    public void setHorizontality(boolean horizontality) {
        isHorizontal = horizontality;
    }
}
