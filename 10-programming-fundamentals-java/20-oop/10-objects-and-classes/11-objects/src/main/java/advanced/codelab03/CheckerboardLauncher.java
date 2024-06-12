package advanced.codelab03;

import advanced.codelab02.BigWindow;

import java.awt.*;

public class CheckerboardLauncher {

    /**
     * This is a completely optional codelab.
     * (But it's a fun one though...)
     *
     * ------------------
     * Do the following
     * ------------------
     *
     * Create a checkerboard (black and red tiles) using BigWindow, BigCanvas and BigSquare.
     * The checkerboard should dynamically generate tiles based on the BigWindow's dimensions.
     * Feel free to create extra (helper) methods if you feel they will help you write
     * cleaner / better / simpler code.
     *
     */
    public static void main(String[] args) {

        // Start programming here!
        BigWindow myWindow = new BigWindow(1000,400);
        BigCanvas myCheckerboard = new BigCanvas();
        int squareSize = 50;
        for (int x = 0; x < myWindow.getWindowDimensions().getWidth(); x = x + squareSize) {
            for (int y = 0; y < myWindow.getWindowDimensions().getHeight(); y = y + squareSize) {
                if (((x + y)/squareSize) % 2 == 0){
                    myCheckerboard.addShape(new BigSquare(x,y, Color.RED));
                }
                else {
                    myCheckerboard.addShape(new BigSquare(x,y, Color.BLACK));
                }
            }
        }
        myWindow.addComponent(myCheckerboard);
        myWindow.launch();
    }

}
