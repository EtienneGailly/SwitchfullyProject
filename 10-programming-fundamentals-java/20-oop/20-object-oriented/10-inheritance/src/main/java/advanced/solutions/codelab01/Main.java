package advanced.solutions.codelab01;

import static advanced.solutions.codelab01.Health.GOATERRIBLE;
import static advanced.solutions.codelab01.Health.GOATKAY;

public class Main {

    public static void main(String[] args) {
        Goat goat = new Goat(7, GOATKAY);
        MountainGoat mountainGoat = new MountainGoat(100, GOATERRIBLE);

        System.out.println(mountainGoat);
    }
}
