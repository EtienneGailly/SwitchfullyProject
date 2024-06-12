package presentationslides.inheritancechapter.pets;

import java.awt.*;

public class Cat extends Pet {

    private boolean isHungry;
    private int lifesLeft;

    public Cat(String name, Color color, String mood, boolean isHungry, int lifesLeft) {
        super(name, color, mood);
        this.isHungry = isHungry;
        this.lifesLeft = lifesLeft;
    }

    public String meow() {
        return "Miauw miauw!";
    }
}
