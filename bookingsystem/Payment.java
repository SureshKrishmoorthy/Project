package com.bookingsystem;

import java.util.Scanner;

public class Payment {
    private static final int amount = 500;

    static boolean isSuccessful() {
        boolean b = false;
        Scanner in = new Scanner(System.in);
        boolean bool = true;
        long ph_no;
        do {
            System.out.println("Enter Your Phone No: ");
            ph_no = in.nextLong();
            String value = String.valueOf(ph_no);
            if (value.length() == 10) {
                bool = false;
            }

        } while (bool);
        System.out.println("Generating OTP");
        double num = Math.random() * 9999 + 9999;
        int Otp = (int) num;
        System.out.println(Otp);
        System.out.println("Enter the otp");
        if (Otp == in.nextInt()) {
            b = true;
        }
        return b;
    }
}
