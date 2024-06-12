package presentationslides.objectschapter.cat01;

public class Cat {

    private String mood;
    private boolean isHungry;
    private int lifesLeft;
    private int energyLevel;
    private String color;

    // Constructor (body hidden)
    public Cat(String mood, boolean isHungry, int lifesLeft, int energyLevel, String color) {
        this.mood = mood;
        this.isHungry = isHungry;
        this.lifesLeft = lifesLeft;
        this.energyLevel = energyLevel;
        this.color = color;
    }

    public String meow() {
        if(mood.equals("Pissed")) {
            return "Raaauw!";
        } return "Purr... Miauw";
    }

    public void feed() {
        if(isHungry) {
            energyLevel += 10;
        }
    }

    public void play() {
        energyLevel -= 10;
        mood = "Happy";
    }
}
