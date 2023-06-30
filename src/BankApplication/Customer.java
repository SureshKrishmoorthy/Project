package BankApplication;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    String Name, User_name, Mobilenum;
    private double bal;
    private StringBuffer password;
    ArrayList<String> transaction;
    static Date date = new Date();

    public StringBuffer getPassword() {
        return password;
    }

    public void setPassword(StringBuffer password) {
        this.password = password;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public Customer(String name, String user_name, String mobilenum) {
        Name = name;
        User_name = user_name;
        this.Mobilenum = mobilenum;
        transaction = new ArrayList<String>();
        addTransaction(String.format("Initial Deposit-" + NumberFormat.getCurrencyInstance().format(bal) + "as on " + "1$tD" + "at" + "1$tT.", date), date);
    }


    public void withdraw(double amount) {
        if (bal > (amount - 200)) {
            bal -= amount;
            addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount)) + "Debited from Your account" + "as on " + "@$tD" + "at" + "1$tT.", date);
        } else
            System.out.println("Insuffiient Balance");
    }


    public void deposit(double amount) {
        bal += amount;
        addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount)) + "Credited to Your account" + "as on " + "@$tD" + "at" + "1$tT.", date);
    }

    private void addTransaction(String format, Date date) {
        transaction.add(format + ":" + date);
    }
}
