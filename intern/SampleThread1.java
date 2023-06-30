package com.FullCreative.intern;

public class SampleThread1 extends Thread
{
    public synchronized void run1()
 {
     for (char ch=65;ch<='E';ch++)
     {
         System.out.print(Thread.currentThread().getName());
         System.out.println(ch);
      //   yield();
         try {
             wait(5000);
             Thread.sleep(1);

         } catch (InterruptedException e)
         {
           e.printStackTrace();
         }
     }
     System.out.print(Thread.currentThread().getPriority());
     notify();
 }
}
class SampleThread2 extends Thread
{
    public synchronized void run()
    {
        for (char ch=65;ch<='E';ch++)
        {
            System.out.print(Thread.currentThread().getName());
            System.out.println(ch);

            try {
             //  wait(100000);
                Thread.sleep(1);

            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.print(Thread.currentThread().getPriority());

        }
     //  notify();
    }
}
