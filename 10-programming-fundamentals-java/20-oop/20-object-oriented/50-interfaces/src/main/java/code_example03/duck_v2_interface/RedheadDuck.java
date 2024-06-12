package code_example03.duck_v2_interface;

import code_example03.duck_v2_interface.behavior.Flyable;
import code_example03.duck_v2_interface.behavior.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable{

    @Override
    public void display() {
        System.out.println("I'm a Redhead duck");
    }

    @Override
    public void fly() {
        System.out.println("Flapping wings, gaining altitude, flying!");
    }

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
