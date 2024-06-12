package advanced.codelab01;

public class Main {


    /**
     * The class Vehicle is a huge mess.
     * Use that static factory method pattern to clean up this code.
     * You can find an example of a static method factory in the Vehicle class.
     *
     * After you're done the Vehicle class should only have one private constructor.
     * All objects should be created by static method factories
     */
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Vehicle(1, 2),
                new Vehicle("Electric step", 1, 2, "Electric"),
                new Vehicle("Car", 4, 4, "V8"),
                new Vehicle(4, 5000, "Balloon"),
                new Vehicle(416, 2, "Turbo Jet", 10000),
                new Vehicle( 1000, "Mercury Marine"),
        };

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }
}
