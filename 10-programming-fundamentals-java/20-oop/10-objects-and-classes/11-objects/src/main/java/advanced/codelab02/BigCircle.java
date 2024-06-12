package advanced.codelab02;

import java.awt.*;

/**
 * You don't have to change anything in this class.
 */
public class BigCircle extends BigShape {

    private int size;

    public BigCircle(int xCoordinate, int yCoordinate, int size, Color color) {
        super(xCoordinate, yCoordinate, color);
        this.size = size;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(getXCoordinate(), getYCoordinate(), size, size);
    }
}
