package basic.solutions.codelab03.staff;

import basic.solutions.codelab03.food.Food;
import basic.solutions.codelab03.house.Kitchen;

public class Cook {

    private final String name;

    public Cook(String name) {
        this.name = name;
    }

    Food prepareFood(Kitchen kitchen) {
        System.out.println("Cook " + name + " is preparing some tasty chicken");
        return kitchen.prepareFood("Tasty chicken");
    }
}
