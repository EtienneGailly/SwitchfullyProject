package basic.solutions.codelab03;

import java.util.List;

public class ShopApp {

    public static void main(String[] args) {
        Rack rack = new Rack(List.of(new Shelf(), new Shelf()));

        rack.fill(new Grocery[]{
                        new Grocery("Tomato"),
                        new Grocery("Potato")},
                0);

        rack.fill(new Grocery[]{
                        new Grocery("Soup"),
                        new Grocery("Water"),
                        new Grocery("Soup")},
                1);

        System.out.println("Should be Potato: " + rack.takeGroceryFromShelf(0));
    }

}
