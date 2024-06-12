package advanced.solutions.codelab03.game.gamefactory;

import advanced.solutions.codelab03.game.Game;
import advanced.solutions.codelab03.game.GameFactory;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RandomGameFactory implements GameFactory {

    public static final int DIMENSION = 10;
    private RandomStartingOrientationGenerator randomStartingOrientationGenerator;
    private List<ShipToBePlaced> shipToBePlacedList;

    public RandomGameFactory(RandomStartingOrientationGenerator randomStartingOrientationGenerator, ShipListRepository shipListRepository) {
        this.randomStartingOrientationGenerator = randomStartingOrientationGenerator;
        this.shipToBePlacedList = shipListRepository.getShipToBePlacedList();
    }

    @Override
    public Game createGame() {
        for(ShipToBePlaced shipToBePlaced: shipToBePlacedList){
            do {
                shipToBePlaced.placeShip(randomStartingOrientationGenerator.getRandomOrientation(shipToBePlaced.getShipLength(), DIMENSION));
            } while(shipsOverlap(shipToBePlacedList));

        }
        return new Game(shipToBePlacedList.stream().map(ShipToBePlaced::toShip).collect(Collectors.toList()), DIMENSION);
    }

    private boolean shipsOverlap(List<ShipToBePlaced> shipToBePlacedList) {
        long coordinateLength = shipToBePlacedList.stream().map(ShipToBePlaced::getCoordinates).flatMap(Collection::stream).count();
        long uniqueCoordinatesLength = shipToBePlacedList.stream().map(ShipToBePlaced::getCoordinates).flatMap(Collection::stream).distinct().count();
        return coordinateLength != uniqueCoordinatesLength;
    }
}
