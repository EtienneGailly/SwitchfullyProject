package basic.codelab01;

/**
 * Do the following
 * ------------------
 * 1. In the body of the main method, create a World object
 * 2. Call the getMessage() method
 * 3. Print (System.out.println) the String object which is returned by getMessage().
 */
public class WorldRunner {

    public static void main(String[] args) {
        World myWorld = new World();
        String myMessage = myWorld.getMessage();
        System.out.println(myMessage);
    }

}
