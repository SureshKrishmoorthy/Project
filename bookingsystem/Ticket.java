package com.bookingsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {

    static ArrayList train1ticket = new ArrayList<PassengerDetails>();
    static ArrayList train2ticket = new ArrayList<PassengerDetails>();
    static Scanner in = new Scanner(System.in);
    private int pnrNo;
    private String start;
    private String end;
    private String status;
    private int trainCode;
    static int SEAT_COUNT = 0;

    public Ticket(int pnrNo, int trainCode,String start,String end) {
        this.start=start;
        this.end=end;
        this.pnrNo = pnrNo;
        if (SEAT_COUNT <=10) {
            this.status = "Confirmed";
        } else {
            this.status = "Waiting List";
        }
        this.trainCode = trainCode;

    }
    public int getPnrNo() {
        return pnrNo;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public int getTrainCode() {
        return trainCode;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("%-8s%-8s%-10s%-10s%-10s", pnrNo, status, trainCode,start,end);
    }
}
