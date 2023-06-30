package com.bookingsystem;

public class InvalidUserName extends Throwable{
    @Override
    public String getMessage() {
        return "Incorrect UserName and Password";
    }
}
