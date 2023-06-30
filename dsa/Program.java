package com.dsa;

import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedLizt list=new LinkedLizt();
        list.insertElement(12);
        list.insertElement(13);
        list.insertElement(14);
        list.insertElement(15);
        list.loop();
//        System.out.println(list.next());
//        System.out.println(list.next());
//        System.out.println(list.next());
//        System.out.println(list.next());
        Iterater iter=list.iterater();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
