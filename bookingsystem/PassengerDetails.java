package com.bookingsystem;


public class PassengerDetails extends Ticket {
    String name;
    int age;


    public PassengerDetails(String name, int age, int num, int traincode,String start,String end) {
        super(num, traincode,start,end);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10d%-10s%-10s%-10s%-10s", name, age, getPnrNo(), getStatus(),super.getStart(),super.getEnd());
    }

    public String getName() {
        return name;
    }
}