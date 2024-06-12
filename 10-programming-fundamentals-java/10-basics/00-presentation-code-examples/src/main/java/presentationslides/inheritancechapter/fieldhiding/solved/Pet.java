package presentationslides.inheritancechapter.fieldhiding.solved;

public class Pet {

    private int lifesLeft = 1;

    protected Pet(int lifesLeft) {
        this.lifesLeft = lifesLeft;
    }

    public int getLifesLeft() {
        return lifesLeft;
    }
}
