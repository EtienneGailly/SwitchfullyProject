package advanced.solutions.codelab03.game.gamefactory;

import advanced.solutions.codelab03.game.Coordinate;
import advanced.solutions.codelab03.game.gamefactory.StartingOrientation.Orientation;

import java.util.Random;

import static advanced.solutions.codelab03.game.Coordinate.coordinate;
import static advanced.solutions.codelab03.game.gamefactory.StartingOrientation.Orientation.HORIZONTAL;
import static advanced.solutions.codelab03.game.gamefactory.StartingOrientation.Orientation.VERTICAL;
import static advanced.solutions.codelab03.game.gamefactory.StartingOrientation.horizontalStartingPosition;
import static advanced.solutions.codelab03.game.gamefactory.StartingOrientation.verticalStartingPosition;

public class RandomStartingOrientationGenerator {

    private Random random = new Random();

    public StartingOrientation getRandomOrientation(int shipLength, int dimension) {
        Orientation orientation = getRandomOrientation();
        int columnBound = orientation == HORIZONTAL ? dimension - shipLength : dimension;
        int rowBound = orientation == VERTICAL ? dimension - shipLength : dimension;

        Coordinate position = coordinate(random.nextInt(rowBound), random.nextInt(columnBound));
        return orientation == HORIZONTAL ? horizontalStartingPosition(position) : verticalStartingPosition(position);
    }

    private Orientation getRandomOrientation() {
        return random.nextBoolean() ? HORIZONTAL : VERTICAL;
    }
}
