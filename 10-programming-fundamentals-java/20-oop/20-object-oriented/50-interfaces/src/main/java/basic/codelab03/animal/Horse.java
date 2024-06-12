package basic.codelab03.animal;

public class Horse extends Animal {
    private final double speed;

    public Horse(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public double timeToReach(int distance) {
        int restingTime = distance / 20;
        return distance / speed + restingTime;
    }

    public void makeSound() {
        System.out.println("Hayo, " + getName() + "!");
    }
}
