package basic.solutions.codelab03.staff;

import basic.solutions.codelab03.food.Food;
import basic.solutions.codelab03.house.Bathroom;
import basic.solutions.codelab03.house.Diningroom;
import basic.solutions.codelab03.house.Garden;
import basic.solutions.codelab03.house.Kitchen;

public class Staff {

    private final Gardener gardener;
    private final Butler butler;
    private final Cook cook;
    private final Plumber plumber;

    public Staff(Gardener gardener, Butler butler, Cook cook, Plumber plumber) {
        this.gardener = gardener;
        this.butler = butler;
        this.cook = cook;
        this.plumber = plumber;
    }

    public void tendToGarden(Garden garden) {
        gardener.tendTo(garden);
    }

    public void serveFood(Kitchen kitchen, Diningroom diningroom) {
        Food food = cook.prepareFood(kitchen);
        butler.serveFood(food, diningroom);
    }

    public void fixBathroom(Bathroom bathroom) {
        plumber.fixBathroom(bathroom);
    }
}
