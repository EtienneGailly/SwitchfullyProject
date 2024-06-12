package advanced.solutions.codelab03.game.gamefactory;

import advanced.solutions.codelab03.game.Coordinate;
import advanced.solutions.codelab03.game.Ship;

import java.util.List;

import static advanced.solutions.codelab03.game.Coordinate.coordinate;
import static advanced.solutions.codelab03.game.gamefactory.StartingOrientation.Orientation.HORIZONTAL;
import static com.google.common.collect.Lists.newArrayList;

public class ShipToBePlaced {

    private int shipLength;
    private List<Coordinate> coordinates = newArrayList();

    public ShipToBePlaced(int shipLength) {
        this.shipLength = shipLength;
    }

    public static ShipToBePlaced carrier() {
        return new ShipToBePlaced(5);
    }

    public static ShipToBePlaced battleship() {
        return new ShipToBePlaced(4);
    }

    public static ShipToBePlaced destroyer() {
        return new ShipToBePlaced(3);
    }

    public static ShipToBePlaced submarine() {
        return new ShipToBePlaced(3);
    }

    public static ShipToBePlaced patrolBoat() {
        return new ShipToBePlaced(2);
    }

    public int getShipLength() {
        return shipLength;
    }

    public void placeShip(StartingOrientation startingOrientation) {
        coordinates = getCoordinates(startingOrientation);
        System.out.println("Placed ship at: " + coordinates);
    }

    private List<Coordinate> getCoordinates(StartingOrientation startingOrientation) {
        if (startingOrientation.getOrientation() == HORIZONTAL) {
            return placeHorizontal(startingOrientation);
        }
        return placeVertical(startingOrientation);
    }

    private List<Coordinate> placeVertical(StartingOrientation startingOrientation) {
        List<Coordinate> newCoordinates = newArrayList();
        for (int i = startingOrientation.getRow(); i < shipLength + startingOrientation.getRow(); i++) {
            newCoordinates.add(coordinate(i, startingOrientation.getColumn()));
        }
        return newCoordinates;
    }

    private List<Coordinate> placeHorizontal(StartingOrientation startingOrientation) {
        List<Coordinate> newCoordinates = newArrayList();
        for (int i = startingOrientation.getColumn(); i < shipLength + startingOrientation.getColumn(); i++) {
            newCoordinates.add(coordinate(startingOrientation.getRow(), i));
        }
        return newCoordinates;
    }

    public Ship toShip() {
        return new Ship(coordinates);
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }
}
