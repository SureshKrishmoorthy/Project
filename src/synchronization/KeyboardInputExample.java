package synchronization;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class KeyboardInputExample implements KeyListener {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Keyboard Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add KeyListener to the frame
        frame.addKeyListener(new KeyboardInputExample());

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Check the key code
        if (keyCode == KeyEvent.VK_ENTER) {
            System.out.println("Enter key pressed");
        } else if (keyCode == KeyEvent.VK_ESCAPE) {
            System.out.println("Escape key pressed");
        } else {
            System.out.println("Other key pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }
}

