package basic;

public class LoopsCodelabs02 {

    public static void main(String[] args) {
        int numberOfPeople = 10;
        giveTicket(numberOfPeople);
        giveCoke(numberOfPeople);
        increaseTemperature(0);
    }

    /*
     * We're going to write a little application for a cinema. Implement the following methods
     */

    /**
     * Every person needs to get a ticket.
     * print out 'Ticket' once for every person
     */
    public static void giveTicket(int numberOfPeople) {
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Ticket");
        }
    }

    /**
     * Every two people need to get a Coke.
     * Print out 'Giving a Coke' for every two people
     */
    public static void giveCoke(int numberOfPeople) {
        for (int i = 0; i < numberOfPeople/2; i++) {
            System.out.println("Giving a Coke");
        }
    }

    /**
     * The temperature of the room is way too cold.
     * Print out 'Temperature has been increased by one. The new temperature is now <new_temperature>' until the temperature is 22 degrees.
     */
    public static void increaseTemperature(int currentTemperature) {
        for (int temperature = currentTemperature + 1 ; temperature <= 22 ; temperature++) {
            System.out.println("Temperature has been increased by one. The new temperature is now " + temperature);
        }
    }

}
