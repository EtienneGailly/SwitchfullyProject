package basic.solutions.codelab03;

public class Horse implements Rideable {

    private final String name;
    private final double speed;

    public Horse(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double timeToReach(int distance) {
        int restingTime = distance / 20;
        return distance / speed + restingTime;
    }

    public void makeSound() {
        System.out.println("Hayo, " + name + "!");
    }
}
