package basic.codelab04;

import static java.lang.Math.abs;

public class RaceCar {
    private int numberOfGears;
    private int currentGear;

    public RaceCar(int numberOfGears, int currentGear) {
        this.numberOfGears = numberOfGears;
        this.currentGear = currentGear;
        if (this.currentGear <0){
            this.currentGear = 0;
        }
        else if (this.currentGear > this.numberOfGears) {
            this.currentGear = this.numberOfGears;
        }
    }

    public RaceCar() {
        this.numberOfGears = 6;
        this.currentGear = 0;
    }

    public void shiftGearUp() {
        if (currentGear < numberOfGears) {
            currentGear += 1;
        }
    }

    public void shiftGearDown() {
        if (currentGear > 0) {
            currentGear -= 1;
        }
    }

    private void shiftGear(int gear) {
        if (abs(currentGear-gear) <= 1 && gear >= 0 && gear <= numberOfGears) {
            currentGear = gear;
        }
    }

    @Override
    public String toString() {
        return "Racecar with " + numberOfGears + " in total, currently in " + currentGear + " gear.";
    }
}
