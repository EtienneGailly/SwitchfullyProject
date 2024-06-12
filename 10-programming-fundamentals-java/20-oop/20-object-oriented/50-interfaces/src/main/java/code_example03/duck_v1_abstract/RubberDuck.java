package code_example03.duck_v1_abstract;

/**
 * Class representing a plastic, yellow rubber duck
 */
public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Not an alive duck, but a yellow rubber ducky");
    }

    /**
     * Since a RubberDuck is not an alive Duck,
     * they do not quack... We better override the
     * quack method so that it squeaks...
     */
    @Override
    public void quack() {
        System.out.println("Squeeaak...");
    }

    /**
     * Since a RubberDuck is not an alive Duck,
     * they do not fly...
     */
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not available");
    }
}
