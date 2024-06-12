package advanced.solutions.codelab03.game.gamefactory;

import advanced.solutions.codelab03.game.Game;
import advanced.solutions.codelab03.game.GameFactory;
import advanced.solutions.codelab03.game.Ship;
import com.google.common.collect.Lists;

import static advanced.solutions.codelab03.game.Coordinate.coordinate;
import static com.google.common.collect.Lists.newArrayList;

public class HardCodedGameFactory implements GameFactory {

    @Override
    public Game createGame() {
        return new Game(Lists.newArrayList(new Ship(newArrayList(coordinate(5, 5), coordinate(5,4)))), 10);
    }
}
