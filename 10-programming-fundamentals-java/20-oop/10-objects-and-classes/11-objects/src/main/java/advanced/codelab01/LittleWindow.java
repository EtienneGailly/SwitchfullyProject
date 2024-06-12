package advanced.codelab01;

import javax.swing.*;

/**
 * You don't have to change anything in this class.
 */
public class LittleWindow {

    private JFrame window;

    public LittleWindow() {
        window = new JFrame();
    }

    public void addComponent(JComponent component) {
        window.getContentPane().add(component);
    }

    public void launch() {
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.setVisible(true);
        window.repaint();
    }
}
