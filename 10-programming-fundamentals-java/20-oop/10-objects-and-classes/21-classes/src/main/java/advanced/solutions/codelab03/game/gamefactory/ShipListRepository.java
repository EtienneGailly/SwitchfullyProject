package advanced.solutions.codelab03.game.gamefactory;

import java.util.List;

import static advanced.solutions.codelab03.game.gamefactory.ShipToBePlaced.*;
import static com.google.common.collect.Lists.newArrayList;

public class ShipListRepository {

    public List<ShipToBePlaced> getShipToBePlacedList() {
        return newArrayList(
                carrier(),
                battleship(),
                submarine(),
                destroyer(),
                patrolBoat()
        );
    }
}
