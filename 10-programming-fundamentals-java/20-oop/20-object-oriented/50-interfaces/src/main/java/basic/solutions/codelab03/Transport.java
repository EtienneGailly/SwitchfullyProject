package basic.solutions.codelab03;

public class Transport {

    private final PrintingSystem printingSystem;

    public Transport(PrintingSystem printingSystem) {
        this.printingSystem = printingSystem;
    }

    public void ride(Rideable rideable, int distance) {
        printingSystem.print("Driving " + rideable.getName() + " to the sunset.");
        printingSystem.print("It goes " + rideable.getSpeed() + "km per hour. Wow, that's fast!");
        printingSystem.print("It will take " + rideable.timeToReach(distance) + "hours to ride " + distance + "km.");
        printingSystem.print("Let's go! ");
        rideable.makeSound();
    }
}
