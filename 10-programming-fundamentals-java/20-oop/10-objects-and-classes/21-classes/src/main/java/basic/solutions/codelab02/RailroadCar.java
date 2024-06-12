package basic.solutions.codelab02;

public class RailroadCar {
    private String serialNumber;
    private boolean isFirstClass = false;
    private int numberOfSeats = 100;
    private boolean hasToilet = false;

    public RailroadCar(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public RailroadCar(String serialNumber, boolean isFirstClass, int numberOfSeats, boolean hasToilet) {
        this.serialNumber = serialNumber;
        this.isFirstClass = isFirstClass;
        this.numberOfSeats = numberOfSeats;
        this.hasToilet = hasToilet;
    }

    @Override
    public String toString() {
        return "RailroadCar " + serialNumber + ": Number of seats: " + numberOfSeats + " - First class: " + isFirstClass + " - Has a toilet: " + hasToilet;
    }

    public void setFirstClass(boolean firstClass) {
        isFirstClass = firstClass;
    }

    public void toggleToilet() {
        this.hasToilet = !hasToilet;
    }
}
