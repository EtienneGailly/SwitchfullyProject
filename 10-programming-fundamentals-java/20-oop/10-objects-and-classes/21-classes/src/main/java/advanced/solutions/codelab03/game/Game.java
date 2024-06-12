package advanced.solutions.codelab03.game;

import advanced.solutions.codelab03.input.InputListener;
import advanced.solutions.codelab03.input.ListenerResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static advanced.solutions.codelab03.game.Coordinate.coordinate;
import static advanced.solutions.codelab03.game.HitOrMiss.HIT;
import static advanced.solutions.codelab03.game.HitOrMiss.MISS;
import static advanced.solutions.codelab03.input.ListenerResponse.SHIP_DESTROYED;
import static advanced.solutions.codelab03.input.ListenerResponse.WON;

public class Game implements InputListener {

    private final List<Ship> shipList;
    private int dimension;
    private Map<Coordinate, HitOrMiss> attemptMap = new HashMap<>();

    public Game(List<Ship> shipList, int dimension) {
        this.shipList = shipList;
        this.dimension = dimension;
    }

    @Override
    public ListenerResponse listenToInput(Coordinate coordinate) {
        HitOrMiss attempt = isHit(coordinate);
        attemptMap.put(coordinate, attempt);

        Optional<Ship> maybeShip = shipList.stream()
                .filter(ship -> ship.isHit(coordinate))
                .findFirst();

        if (maybeShip.isEmpty()) {
            return ListenerResponse.MISS;
        }

        maybeShip.get().hit(coordinate);
        if (maybeShip.get().isAlive()) {
            return ListenerResponse.HIT;
        }

        if (shipList.stream().noneMatch(ship -> ship.isAlive())) {
            return WON;
        }
        return SHIP_DESTROYED;
    }

    public HitOrMiss isHit(Coordinate coordinate) {
        return shipList.stream().anyMatch(ship -> ship.isHit(coordinate)) ? HIT : MISS;
    }

    @Override
    public String toString() {
        String result = "";
        for (int x = 0; x < dimension; x++) {
            for (int y = 0; y < dimension; y++) {
                result += findRightSymbol(coordinate(x, y));
            }
            result += "\n";
        }
        return result;
    }

    private String findRightSymbol(Coordinate coordinate) {
        HitOrMiss attempt = attemptMap.get(coordinate);
        if (attempt == null) {
            return "0 ";
        }
        return attempt.getSymbol() + " ";
    }
}
