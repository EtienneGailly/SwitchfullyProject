package advanced.solutions.codelab03;

import advanced.solutions.codelab03.game.Game;
import advanced.solutions.codelab03.game.gamefactory.RandomGameFactory;
import advanced.solutions.codelab03.game.gamefactory.RandomStartingOrientationGenerator;
import advanced.solutions.codelab03.game.gamefactory.ShipListRepository;
import advanced.solutions.codelab03.input.UserInputScanner;

public class Main {

    public static void main(String[] args) {
        Game game = getGameFactory().createGame();
        new UserInputScanner(game).startGame();
    }

    private static RandomGameFactory getGameFactory() {
        return new RandomGameFactory(new RandomStartingOrientationGenerator(), new ShipListRepository());
//        return new HardCodedGameFactory();
    }

}
