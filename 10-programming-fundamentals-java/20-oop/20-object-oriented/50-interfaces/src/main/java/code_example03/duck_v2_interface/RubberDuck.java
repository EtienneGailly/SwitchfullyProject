package code_example03.duck_v2_interface;

import code_example03.duck_v2_interface.behavior.Quackable;

/**
 * Class representing a plastic, yellow rubber duck
 */
public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("Not an alive duck, but a yellow rubber ducky");
    }

    @Override
    public void quack() {
        System.out.println("Squeeaak...");
    }
}
