package presentationslides.inheritancechapter.pets;

import java.awt.*;

public class Pet {

    private String name;
    private Color color;
    private String mood;

    public Pet(String name, Color color, String mood) {
        this.name = name;
        this.color = color;
        this.mood = mood;
    }

    public void feed() {
        mood = "Happy";
    }

    public String play() {
        if(mood.equals("Happy")) {
            return name + " is playing with us";
        } return name + " is not in the mood to play";
    }

}
