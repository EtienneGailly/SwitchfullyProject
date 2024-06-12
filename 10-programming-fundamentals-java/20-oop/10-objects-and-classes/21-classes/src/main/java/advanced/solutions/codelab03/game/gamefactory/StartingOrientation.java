package advanced.solutions.codelab03.game.gamefactory;

import advanced.solutions.codelab03.game.Coordinate;

public class StartingOrientation {

    private Coordinate coordinate;
    private Orientation orientation;

    public enum Orientation{
        HORIZONTAL,
        VERTICAL;
    }

    private StartingOrientation(Coordinate coordinate, Orientation orientation) {
        this.coordinate = coordinate;
        this.orientation = orientation;
    }

    public static StartingOrientation horizontalStartingPosition(Coordinate coordinate){
        return new StartingOrientation(coordinate, Orientation.HORIZONTAL);
    }

    public static StartingOrientation verticalStartingPosition(Coordinate coordinate){
        return new StartingOrientation(coordinate, Orientation.VERTICAL);
    }

    public int getColumn() {
        return coordinate.getColumn();
    }

    public int getRow() {
        return coordinate.getRow();
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
