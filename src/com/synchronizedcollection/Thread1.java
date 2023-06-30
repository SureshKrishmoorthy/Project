package com.synchronizedcollection;

public class Thread1 implements Runnable{


    @Override
    public void run() {
        ListThread.list.add(3,23);
        ListThread.list.remove(3);
        ListThread.list.add(4,5);
    }


}
