package BankApplication;

import java.util.*;

public interface SavingsAccount {
    double rate=0.04,limit1=10000,limit2=200;
    void withdraw(double amount,Date date);
    void deposit(double amount,Date date);

}
