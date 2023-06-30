package usecase;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ListIterator;

public class DisplayImage implements KeyListener {
    static Linked img = new Linked();
    static JFrame frame;
    static ListIterator li;

    public static void main(String[] args) {
        img.insertImage();
        frame = new JFrame("Image");
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new DisplayImage());

    }

    void pathset(String path) {
        ImageIcon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);
        frame.setSize(icon.getIconWidth(), icon.getIconHeight());
        frame.getContentPane().add(label);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

        li = img.image.listIterator();
        boolean b = true;

        do {
            int keyCode = e.getKeyCode();

            if (keyCode == KeyEvent.VK_LEFT) {
                System.out.println("hi");
                Image im = (Image) li.previous();
                String path = im.getPath();
                System.out.println(im);
                pathset(path);
                break;
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                System.out.println("hello");
                Image i = (Image) li.next();
                String path = i.getPath();
                pathset(path);
                System.out.println(i);
                break;
            } else {
                System.out.println("Other key pressed");
                b = false;
                break;
            }
        } while (b);

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
