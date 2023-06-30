package com.synchronizedcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//If multiple threads trying to attack the list we will get concurrent modification error
//because the list is non-synchronized
public class ListThread {

    static List list;
    public static void main(String[] args) {
        ArrayList lis;lis=new ArrayList<Integer>();
        lis.add(12);
        lis.add(18);
        lis.add(8);
        lis.add(43);
        lis.add(55);
        System.out.println(lis);
        list=Collections.synchronizedList(lis);
        Runnable thread1=new Thread1();
        Runnable thread2=new Thread2();
        Thread t1=new Thread(thread1,"Thread1");
        Thread t2=new Thread(thread2,"Thread2");
        Thread t3=new Thread(thread2,"Thread3");
        t3.start();
        t1.start();
        t2.start();

        System.out.println(list);
    }
}
