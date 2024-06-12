package presentationslides.inheritancechapter.fieldhiding;

public class Cat extends Pet {

    private int lifesLeft = 9;

    public String miauw() {
        return "Miauw, " + lifesLeft + " lifes left!";
    }
}
