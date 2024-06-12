package advanced.solutions.codelab01;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                Vehicle.createBicycle(1, 2),
                Vehicle.createNonFlyingVehicle("Electric step", 1, 2, "Electric"),
                Vehicle.createNonFlyingVehicle("Car", 4, 4, "V8"),
                Vehicle.createBalloon(4, 5000),
                Vehicle.createAirplane(416, 2, "Turbo Jet", 10000),
                Vehicle.createBoat( 1000, "Mercury Marine"),
        };

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }
}
