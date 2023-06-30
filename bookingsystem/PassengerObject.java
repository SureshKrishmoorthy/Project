package com.bookingsystem;

public class PassengerObject {
    public static void createObject() {
        BookingMain.user.put("Suresh1", new Passenger("Suresh", "Suresh1", "Suresh@1", 9988998877l, 23));
        BookingMain.user.put("Muthu2001", new Passenger("Muthu", "Muthu2001", "Muthu@1", 8798765489l, 27));
        BookingMain.user.put("Vasanth", new Passenger("Vasanth", "Vasanth", "Vasanth@1", 9876787968l, 25));
        BookingMain.user.put("Krish", new Passenger("krish", "Krish", "Krish@1", 6487650978l, 28));
        BookingMain.user.put("SureshBabu", new Passenger("Suresh", "SureshBabu", "Suresh@1", 9988998877l, 31));
    }
}
