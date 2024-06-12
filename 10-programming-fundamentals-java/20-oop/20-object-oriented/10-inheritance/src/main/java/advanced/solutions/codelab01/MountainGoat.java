package advanced.solutions.codelab01;

public class MountainGoat extends Goat {
    public MountainGoat(int age, Health health) {
        super(age, health);
    }

    @Override
    public int getMaxAge() {
        return 8;
    }

    public String climb() {
        return "Climbing a rock...";
    }
}
