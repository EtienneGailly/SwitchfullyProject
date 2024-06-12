package code_example03.duck_v3_composition.behavior.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flapping wings, gaining altitude, flying!");
    }
}
