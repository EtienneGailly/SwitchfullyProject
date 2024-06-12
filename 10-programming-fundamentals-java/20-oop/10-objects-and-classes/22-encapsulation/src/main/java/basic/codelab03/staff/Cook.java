package basic.codelab03.staff;

import basic.codelab03.food.Food;
import basic.codelab03.house.Kitchen;

public class Cook {

    public String name;

    public Cook(String name) {
        this.name = name;
    }

    public Food prepareFood(Kitchen kitchen) {
        System.out.println("Cook " + name + " is preparing some tasty chicken");
        return kitchen.prepareFood("Tasty chicken");
    }
}
