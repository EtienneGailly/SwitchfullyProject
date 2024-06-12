package basic.solutions.codelab03.staff;

import basic.solutions.codelab03.food.Food;
import basic.solutions.codelab03.house.Diningroom;

public class Butler {

    private final String name;

    public Butler(String name) {
        this.name = name;
    }

    void serveFood(Food food, Diningroom diningroom) {
        System.out.println("Butler " + name + " is serving " + food + " in the dining room");
        diningroom.serveFood(food);
    }
}
