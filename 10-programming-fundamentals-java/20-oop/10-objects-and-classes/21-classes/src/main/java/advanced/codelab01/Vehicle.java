package advanced.codelab01;

public class Vehicle {
    private String type;
    private Integer passengers;
    private Integer wheels;
    private String motor;
    private Integer maxHeight;

    public Vehicle(int passengers, Integer wheels) {
        this.type = "Bike";
        this.passengers = passengers;
        this.wheels = wheels;
    }

    /**
     * This is an example of a static factory method. It replaces the above constructor.
     * The benefit is that with this pattern you can give your constructors a name.
     * Making it much clearer why and how you should use them.
     * Also, you can create 2 constructors this way who have the same signature.
     */
    public static Vehicle createBicycle(int passengers, Integer wheels) {
        return new Vehicle("Bike", passengers, wheels, null, null);
    }

    /**
     * When working with static method factories it is a good practice to only have one private constructor.
     */
    private Vehicle(String type, Integer passengers, Integer wheels, String motor, Integer maxHeight) {
        this.type = type;
        this.passengers = passengers;
        this.wheels = wheels;
        this.motor = motor;
        this.maxHeight = maxHeight;
    }

    public Vehicle(String type, int passengers, Integer wheels, String motor) {
        this.type = type;
        this.passengers = passengers;
        this.wheels = wheels;
        this.motor = motor;
    }

    public Vehicle(int passengers, Integer maxHeight, String type) {
        /*
         * The 'this' keyword will allow you to call a constructor in a constructor.
         * This might be confusing so don't over use it.
         */
        this(type, passengers, null, null, maxHeight);
    }

    public Vehicle(Integer passengers, Integer wheels, String motor, Integer maxHeight) {
        this.type = "Airplane";
        this.passengers = passengers;
        this.wheels = wheels;
        this.motor = motor;
        this.maxHeight = maxHeight;
    }

    public Vehicle(int passengers, String motor) {
        this.type = "Boat";
        this.passengers = passengers;
        this.motor = motor;
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
