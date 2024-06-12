package basic.codelab03.house;

import basic.codelab03.food.Food;

public class Kitchen {
    public Food prepareFood(String foodName) {
        System.out.println("Kitchen: preparing " + foodName);
        return new Food(foodName);
    }
}
