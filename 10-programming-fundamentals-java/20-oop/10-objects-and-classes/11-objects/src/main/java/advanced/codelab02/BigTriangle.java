package advanced.codelab02;

import java.awt.*;

/**
 * You don't have to change anything in this class.
 */
public class BigTriangle extends BigShape {

    public BigTriangle(int xCoordinate, int yCoordinate, Color color) {
        super(xCoordinate, yCoordinate, color);
    }

    @Override
    void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillPolygon(
                new int[]{getXCoordinate(), getXCoordinate() + 25, getXCoordinate() + 50},
                new int[]{getYCoordinate(), getYCoordinate() - 50, getYCoordinate()},
                3);
    }
}
