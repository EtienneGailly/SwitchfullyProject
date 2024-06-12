package code_example03.duck_v3_composition.behavior.fly;

public class FlyNever implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Can't fly");
    }

}
