package code_example03.duck_v3_composition;

import code_example03.duck_v3_composition.behavior.fly.FlyNever;
import code_example03.duck_v3_composition.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(new FlyNever(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Wooden decoy duck!");
    }
}
