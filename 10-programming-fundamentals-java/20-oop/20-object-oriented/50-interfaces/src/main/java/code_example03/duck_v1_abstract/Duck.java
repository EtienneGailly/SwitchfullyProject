package code_example03.duck_v1_abstract;

/**
 * Abstract Class representing a Duck
 */
public abstract class Duck {

    public void quack() {
        System.out.println("Quack quack!");
    }

    public void swim() {
        System.out.println("In the water...");
    }

    public void fly() {
        System.out.println("Flapping wings, gaining altitude, flying!");
    }

    public abstract void display();

}
