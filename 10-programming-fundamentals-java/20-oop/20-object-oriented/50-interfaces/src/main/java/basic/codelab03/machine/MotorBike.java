package basic.codelab03.machine;

public class MotorBike extends Machine {
    
    private final String name;
    private final double speed;

    public MotorBike(String name, double speed) {
        super(120);
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
        return distance/speed;
    }

    public void makeSound() {
        System.out.println("Vroom! Vroom! Vrooooooom!");
    }
}
