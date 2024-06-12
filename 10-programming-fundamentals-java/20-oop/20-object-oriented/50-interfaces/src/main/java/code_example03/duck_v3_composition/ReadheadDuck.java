package code_example03.duck_v3_composition;

import code_example03.duck_v3_composition.behavior.fly.FlyWithWings;
import code_example03.duck_v3_composition.behavior.quack.Quack;

public class ReadheadDuck extends Duck {

    public ReadheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Redhead duck!");
    }
}
