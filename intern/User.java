package com.FullCreative.intern;

public class User {
    public static void main(String[] args) {
        LinkedLizt lizt=new LinkedLizt();
        lizt.insert(5);
        lizt.insert(7);
        lizt.insert(7);
        lizt.insert(7);
        lizt.loop();
        System.out.println(lizt.contain(8));
        System.out.println(lizt.addAfter(6,9));

        lizt.insertFirst(12);lizt.loop();
    }
}
