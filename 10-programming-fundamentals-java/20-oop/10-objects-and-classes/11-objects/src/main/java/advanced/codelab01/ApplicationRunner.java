package advanced.codelab01;

import java.awt.*;

public class ApplicationRunner {

    /**
     * Do the following
     * ------------------
     * Create a LittleRectangle object,
     * provide it the following coordinates and color:
     *    x: 10
     *    y: 35
     *    color: red
     * Create a LittleWindow object.
     * Add the LittleRectangle object, as a "component", to the LittleWindow object by calling the correct method.
     * Call the method to launch the LittleWindow object.
     * Run this Java application, a window should open containing a red rectangle.
     *
     */
    public static void main(String[] args) {

        // Start programming here!
        LittleRectangle myRectangle = new LittleRectangle(10,35, Color.RED);
        LittleWindow myWindow = new LittleWindow();
        myWindow.addComponent(myRectangle);
        myWindow.launch();
    }

}
