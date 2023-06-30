package com.synchronizedcollection;

public class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println(ListThread.list.get(3));
        System.out.println(ListThread.list.remove(3));
        System.out.println(ListThread.list.get(3));
    }

}
