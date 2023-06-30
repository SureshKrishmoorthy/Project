package com.bookingsystem;

import java.util.ArrayList;

public class Passenger {
    private String name;
    private String userName;

    private int age;
    private String password;
    private long phoneNo;

    ArrayList tickets;


    public Passenger(String name, String userName, String password, long phoneNo, int age) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.phoneNo = phoneNo;
        this.age=age;
        tickets=new ArrayList();
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

}