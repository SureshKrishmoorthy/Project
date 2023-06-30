package com.FullCreative.intern;

public class Threaddemo extends Thread implements Runnable
{
   public synchronized void run(){
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getId());
      System.out.println(Thread.currentThread().getPriority());
        for(int i=0;i<=5;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("i value ="+ i);
        }
}
   }
