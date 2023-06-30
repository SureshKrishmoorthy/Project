package BankApplication;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Type {
    public static void main(String[] args) {
        Customer customer1=new Customer("suresh","sureshk","982379898");
        customer1.setBal(20000);
        customer1.deposit(230);
        customer1.withdraw(2000);
        System.out.println(customer1.transaction);

    }
}
