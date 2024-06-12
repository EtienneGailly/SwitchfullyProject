package advanced.codelab02;

import javax.swing.*;
import java.awt.*;

/**
 * You don't have to change anything in this class.
 */
public class BigWindow {

    private final int width;
    private final int height;
    private JFrame window;

    public BigWindow(int width, int height) {
        this.width = width;
        this.height = height;
        window = new JFrame();
    }

    public Dimension getWindowDimensions() {
        return new Dimension(width, height);
    }

    public void addComponent(JComponent component) {
        window.getContentPane().add(component);
    }

    public void launch() {
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(30, 30, width, height);
        window.setVisible(true);
    }
}
