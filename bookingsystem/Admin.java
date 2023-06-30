package com.bookingsystem;

public class Admin {
    private final int adminId=231234;
    private final String password="Adminirctc";

    boolean b=false;
    public Admin(int id,String password){
        isAdmin(id,password);
    }

    private void isAdmin(int id,String password){
        if(this.adminId==id && this.password.equals(password))
            b= true;
    }


}
