package basic.codelab03;

import basic.codelab03.animal.Horse;
import basic.codelab03.machine.MotorBike;

public class Transport {

    private final PrintingSystem printingSystem;

    public Transport(PrintingSystem printingSystem) {
        this.printingSystem = printingSystem;
    }

    public void ride(Horse horse, int distance) {
        printingSystem.print("Driving " + horse.getName() + " to the sunset.");
        printingSystem.print("It goes " + horse.getSpeed() + "km per hour. Wow, that's fast!");
        printingSystem.print("It will take " + horse.timeToReach(distance) + "hours to ride " + distance + "km.");
        printingSystem.print("Let's go! ");
        horse.makeSound();
    }

    public void ride(MotorBike motorBike, int distance) {
        printingSystem.print("Driving " + motorBike.getName() + " to the sunset.");
        printingSystem.print("It goes " + motorBike.getSpeed() + "km per hour. Wow, that's fast!");
        printingSystem.print("It will take " + motorBike.timeToReach(distance) + "hours to ride " + distance + "km.");
        printingSystem.print("Let's go! ");
        motorBike.makeSound();
    }
}
