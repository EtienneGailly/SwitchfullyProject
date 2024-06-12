package code_example02;

import code_example02.modus.DrivingModus;

public class Car {

    private String name;
    private DrivingModus drivingModus;

    public Car(String name, DrivingModus drivingModus) {
        this.name = name;
        this.drivingModus = drivingModus;
    }

    public void setDrivingModus(DrivingModus drivingModus) {
        this.drivingModus = drivingModus;
    }

    @Override
    public String toString() {
        return String.format("%s is a car that %s", name, drivingModus.drive());
    }
}
