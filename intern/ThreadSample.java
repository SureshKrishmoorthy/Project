package com.FullCreative.intern;

public class ThreadSample
{
    public static void main(String[] args)
    {
          Threaddemo td = new Threaddemo();
          Thread t1 =  new Thread(td);
          td.start();
            t1.run();
            t1.start();
        System.out.println("Thread demo ="+td.getPriority());
        td.setPriority(1);

        try {
            td.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
       t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        td.run();
    }
}
