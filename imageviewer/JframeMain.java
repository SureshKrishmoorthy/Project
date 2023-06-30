package com.imageviewer;

import javax.swing.*;
import java.util.Scanner;

public class JframeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Path");
        String path = in.next();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Jframe frame = new Jframe(path);
            }
        });


    }
}
