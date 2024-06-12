package basic.solutions.codelab03;

import basic.solutions.codelab03.house.*;
import basic.solutions.codelab03.staff.*;

public class Main {

    /**
     * This application for tending to a fancy villa is a mess.
     * All classes are in a big pile.
     * Encapsulation is non-existent.
     * <p>
     * Let's clean it up:
     * 1. Separate the classes into different packages
     * 2. Encapsulate as much as possible (private if possible, then package private, then protected, if nothing else goes finally public)
     * <p>
     * Bonus (advanced) exercise:
     * Avoid using getters as much as possible. It's a sign of feature envy/message chain (code smells).
     */
    public static void main(String[] args) {
        House house = new House(
                new Bathroom(),
                new Kitchen(),
                new Diningroom(),
                new Garden(),
                new Staff(
                        new Gardener("Patrick"),
                        new Butler("Sofia"),
                        new Cook("Hendrick"),
                        new Plumber("Alexia")
                )
        );

        house.tendToGarden();
        System.out.println("********************");
        house.serveFood();
        System.out.println("********************");
        house.fixBathroom();
    }
}
