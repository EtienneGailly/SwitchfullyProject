package presentationslides.inheritancechapter.pets;

import java.awt.*;

public class Dog extends Pet {

    private Breed breed;

    public Dog(String name, Color color, String mood, Breed breed) {
        super(name, color, mood);
        this.breed = breed;
    }

    public String wagTail() {
        return "wag-left wag-right wag-left";
    }

}
