package com.imageviewer;

import javax.swing.*;
import java.awt.Image;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Jframe extends JFrame {

    JLabel label;
    ArrayList imagepath;

    JButton nextButton;
    JButton prevButton;
    int currentIndex = 0;

    public Jframe(String path) {
        intialise(path);
    }

    private void intialise(String path) {
        Scanner in = new Scanner(System.in);
        currentIndex = 0;
        imagepath = new ArrayList<String>();

        //storing in class and adding it into arraylist

        File file = new File(path);
        if (file.isAbsolute()) {
            File[] filepath = file.listFiles();
            for (File files : filepath)
                imagepath.add(files.getAbsolutePath());
        } else {
            System.out.println("Enter the path ");
            intialise(in.next());
        }


        //setting values for frames
        setTitle("ImageViewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 600);
        setVisible(true);

        label = new JLabel();
        nextButton = new JButton("next");
        prevButton = new JButton("prev");

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextImage();
            }
        });
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPrevImage();
            }
        });

        JPanel panel = new JPanel();
        panel.add(prevButton);
        panel.add(nextButton);

        add(label, BorderLayout.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
//        label.setVerticalAlignment(SwingConstants.CENTER);
        add(panel, BorderLayout.SOUTH);
    }

    void showPrevImage() {
        if (currentIndex > -1 && currentIndex < imagepath.size() - 1) {
            currentIndex -= 1;
            image();
        } else
            currentIndex = imagepath.size() - 1;
    }

    void showNextImage() {
        if (currentIndex > -1 && currentIndex < imagepath.size() - 1) {
            currentIndex += 1;
            image();
        } else
            currentIndex = 0;
    }

    void image() {
        String currentPath = (String) imagepath.get(currentIndex);
        ImageIcon icon = new ImageIcon(currentPath);
        Image image = icon.getImage().getScaledInstance(getWidth() / 2, getHeight() / 2, 1);
        label.setIcon(new ImageIcon(image));
    }

}
