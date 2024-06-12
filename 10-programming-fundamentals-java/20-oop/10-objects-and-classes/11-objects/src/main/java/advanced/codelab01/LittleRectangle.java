package advanced.codelab01;


import javax.swing.*;
import java.awt.*;

/**
 * You don't have to change anything in this class.
 */
public class LittleRectangle extends JComponent {

    private static final int HEIGHT = 35;
    private static final int WIDTH = 50;

    private Color color;
    private int xCoordinate;
    private int yCoordinate;

    public LittleRectangle(int xCoordinate, int yCoordinate, Color color) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(xCoordinate, yCoordinate, WIDTH, HEIGHT);
    }

}
