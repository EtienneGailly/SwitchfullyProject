package advanced.codelab02;

import java.awt.*;

public class HouseApplication {

    /**
     * Do the following
     * ------------------
     *
     * Start by having a quick look at all the different .java files (BigCanvas, BigSquare,...).
     * It's perfectly fine if you see things you don't understand (yet).
     *
     * Then, create a BigWindow object (width 1000 and height 450)
     * Create a BigCanvas object
     *      Create Shape objects (BigCircle, BigSquare and BigTriangle) and add them to the BigCanvas object.
     *      (3 houses, 1 sun in total: read below)
     * Add the BigCanvas object, as a "component" to the BigWindow object
     * Call the method to launch the BigWindow object.
     *
     * Run the application, we want to see the following:
     *      A completely red house on the bottom-left
     *      A house with a black roof and a yellow building in the bottom-middle
     *      A completely blue house on the bottom-right
     *      A yellow sun on the top-right
     *
     * Hint:
     *   - Take a look at the house-and-sun.png screenshot for a final result.
     *   - A house is made with one BigSquare and one BigTriangle
     *   - A sun is made with BigCircle
     *   - When a shape is not visible, it might be possible it is drawn outside of the dimensions of the BigCanvas.
     *      - E.g. try y-coordinate 360 instead of 450 to make sure the shape is inside of the visible canvas area.
     *   - A Color object can be retrieved / created by calling pre-defined constants, such as Color.RED
     *
     * Extra:
     *   When you change the dimensions of the BigWindow object, our houses and sun should adapt to this new size.
     *   The sun should always be located to the far-left, -right or middle of the window.
     *   Hint: use the getWindowsDimensions() method on BigWindow.
     *
     */
    public static void main(String[] args) {
        // Start programming here!
        BigWindow myWindow = new BigWindow(1000,450);
        BigCanvas myCanvas = new BigCanvas();
        BigCircle myCircle = new BigCircle(875,0,100, Color.YELLOW);
        BigSquare square1 = new BigSquare(100,300, Color.RED);
        BigSquare square2 = new BigSquare(500,300, Color.YELLOW);
        BigSquare square3= new BigSquare(900,300, Color.BLUE);
        BigTriangle triangle1 = new BigTriangle(100,300, Color.RED);
        BigTriangle triangle2 = new BigTriangle(500,300, Color.BLACK);
        BigTriangle triangle3 = new BigTriangle(900,300, Color.BLUE);
        myCanvas.addShape(myCircle);
        myCanvas.addShape(square1);
        myCanvas.addShape(square2);
        myCanvas.addShape(square3);
        myCanvas.addShape(triangle1);
        myCanvas.addShape(triangle2);
        myCanvas.addShape(triangle3);
        myWindow.addComponent(myCanvas);
        myWindow.launch();
    }

}
