package code_example03.duck_v1_abstract;

/**
 * Class representing a wooden, decoy duck used by hunters
 */
public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Wooden decoy duck!");
    }

    /**
     * Since a DecoyDuck is not an alive Duck,
     * they do not quack... To be honest, it simply doesn't make any sound.
     */
    @Override
    public void quack() {
        throw new UnsupportedOperationException("Not available");
    }

    /**
     * Since a DecoyDuck is not an alive Duck,
     * they do not fly...
     */
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not available");
    }
}
