package advanced.codelab02;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * You don't have to change anything in this class.
 */
public class BigCanvas extends JComponent {

    private List<BigShape> shapes;

    public BigCanvas() {
        shapes = new ArrayList<>();
    }

    public void addShape(BigShape bigShape) {
        shapes.add(bigShape);
    }

    public void paint(Graphics g) {
        shapes.forEach(bigShape -> bigShape.draw(g));
    }

}
