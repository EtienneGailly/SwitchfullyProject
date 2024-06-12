package basic.solutions.codelab03;

public class Main {

    /**
     * Look at the Transport class. It has some duplication.
     * Remove the duplication in the Transport class by using an interface.
     */
    public static void main(String[] args) {
        Transport transport = new Transport(new PrintingSystem());

        Horse silver = new Horse("Silver", 20);
        transport.ride(silver, 40);

        MotorBike suzy = new MotorBike("Suzy", 50);
        transport.ride(suzy, 75);
    }
}
