package com.bookingsystem;

import java.util.HashSet;

public class Train {

    public static HashSet train=new HashSet<>();
    private int trainNo;
    private String startLoc;
    private String endLoc;

    public static void trainCall(){
        train.add(new Train(23124,"Chennai","Bangalore"));
        train.add(new Train(54261,"Bangalore","Chennai"));
    }

    private Train(int trainNo, String startLoc, String endLoc) {
        this.trainNo=trainNo;
        this.startLoc = startLoc;
        this.endLoc = endLoc;
    }

    void addBooking(){

    }

    public int getTrainNo() {
        return trainNo;
    }

    public String getStartLoc() {
        return startLoc;
    }

    public String getEndLoc() {
        return endLoc;
    }
}
