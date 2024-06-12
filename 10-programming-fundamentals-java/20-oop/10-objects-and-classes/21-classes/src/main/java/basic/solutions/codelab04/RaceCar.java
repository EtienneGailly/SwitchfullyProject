package basic.solutions.codelab04;

public class RaceCar {

    public static final int DEFAULT_NUMBER_OF_GEARS = 6;
    public static final int DEFAULT_CURRENT_GEAR = 0;
    private int numberOfGears;
    private int currentGear;

    public RaceCar() {
        this.numberOfGears = DEFAULT_NUMBER_OF_GEARS;
        this.currentGear = DEFAULT_CURRENT_GEAR;
    }

    public RaceCar(int numberOfGears, int currentGear) {
        this.numberOfGears = numberOfGears;
        this.currentGear = shiftGear(currentGear);
    }


    public void shiftGearDown() {
        this.currentGear = shiftGear(currentGear - 1);
    }

    public void shiftGearUp() {
        this.currentGear = shiftGear(currentGear + 1);
    }

    private int shiftGear(int currentGear) {
        if (currentGear < 0) {
            return 0;
        }
        if (currentGear > numberOfGears) {
            return numberOfGears;
        }
        return currentGear;
    }

    @Override
    public String toString() {
        return "Racecar with " + numberOfGears + " in total, currently in " + currentGear + " gear.";
    }
}
