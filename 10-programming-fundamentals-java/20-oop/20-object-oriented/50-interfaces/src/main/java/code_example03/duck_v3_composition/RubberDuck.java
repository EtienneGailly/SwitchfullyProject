package code_example03.duck_v3_composition;

import code_example03.duck_v3_composition.behavior.fly.FlyNever;
import code_example03.duck_v3_composition.behavior.quack.Squeak;

/**
 * Class representing a plastic, yellow rubber duck
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNever(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Not an alive duck, but a yellow rubber ducky");
    }

}
