package collections.proper.usecase;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDisplayExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Image Display Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an ImageIcon from the image file
        ImageIcon imageIcon = new ImageIcon("/Users/user/Desktop/img.png");

        // Create a JLabel and set the image icon
        JLabel imageLabel = new JLabel(imageIcon);

        // Add the label to the frame
        frame.getContentPane().add(imageLabel);

        // Set the size of the frame
        frame.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());

        // Make the frame visible
        frame.setVisible(true);
    }
}

