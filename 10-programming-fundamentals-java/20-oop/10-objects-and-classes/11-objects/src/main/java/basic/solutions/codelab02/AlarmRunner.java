package basic.solutions.codelab02;

/**
 *  Do the following
 *  ------------------
 *  1. Create a main method (we need it to run/execute the AlarmRunner)
 *  2. In the body of the main method, create an Alarm object
 *  3. Call the methods of Alarm in such a way that the following result is printed
 *      TRING
 *      BLEEP
 *      Hey... how you doing?
 *      PIEP
 *
 * Tip: Inspect the methods, see what they do. Do they have a return value? Do they return a String object?
 */
public class AlarmRunner {

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        alarm.makeTringSound();
        alarm.makeBleepSound();
        alarm.makeInappropriateSound();
        alarm.makePiepSound();
    }
}
