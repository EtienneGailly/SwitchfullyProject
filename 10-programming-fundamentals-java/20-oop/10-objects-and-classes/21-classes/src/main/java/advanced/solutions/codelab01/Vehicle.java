package advanced.solutions.codelab01;

public class Vehicle {
    private final String type;
    private final Integer passengers;
    private final Integer wheels;
    private final String motor;
    private final Integer maxHeight;

    public static Vehicle createBicycle(int passengers, Integer wheels) {
        return new Vehicle("Bike", passengers, wheels, null, null);
    }

    public static Vehicle createNonFlyingVehicle(String type, int passengers, Integer wheels, String motor) {
        return new Vehicle(type, passengers, wheels, motor, null);
    }

    public static Vehicle createBalloon(int passengers, Integer maxHeight) {
        return new Vehicle("Balloon", passengers, null, null, maxHeight);
    }

    public static Vehicle createAirplane(Integer passengers, Integer wheels, String motor, Integer maxHeight) {
        return new Vehicle("Airplane", passengers, wheels, motor, maxHeight);
    }

    public static Vehicle createBoat(int passengers, String motor) {
        return new Vehicle("Boat", passengers, null, motor, null);
    }

    private Vehicle(String type, Integer passengers, Integer wheels, String motor, Integer maxHeight) {
        this.type = type;
        this.passengers = passengers;
        this.wheels = wheels;
        this.motor = motor;
        this.maxHeight = maxHeight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", passengers=" + passengers +
                ", wheels=" + wheels +
                ", motor='" + motor + '\'' +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
