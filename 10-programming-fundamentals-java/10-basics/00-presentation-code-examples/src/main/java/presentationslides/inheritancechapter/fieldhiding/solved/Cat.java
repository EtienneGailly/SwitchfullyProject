package presentationslides.inheritancechapter.fieldhiding.solved;

public class Cat extends Pet {

    public Cat() {
        super(9);
    }

    public String miauw() {
        return "Miauw, " + getLifesLeft() + " lifes left!";
    }
}
