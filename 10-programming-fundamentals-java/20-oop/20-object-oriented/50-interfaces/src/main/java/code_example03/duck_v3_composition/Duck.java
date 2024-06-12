package code_example03.duck_v3_composition;

import code_example03.duck_v3_composition.behavior.fly.FlyBehavior;
import code_example03.duck_v3_composition.behavior.fly.FlyNever;
import code_example03.duck_v3_composition.behavior.quack.MuteQuack;
import code_example03.duck_v3_composition.behavior.quack.QuackBehavior;

/**
 * Abstract Class representing a Duck
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
        flyBehavior = new FlyNever();
        quackBehavior = new MuteQuack();
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("In the water...");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

}
