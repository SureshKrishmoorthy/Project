package com.FullCreative.intern;

public class Demo extends Thread
{


    public void run()

    {
        method1();
        method2();
//        method3();
    }
    void method1()
    {

        for(int i=0;i<=10;i++)
        {
            System.out.println("method 1");
        }
        try
        {
            System.out.println(5/0);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    void method2()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("method 2");
        }

    }
    void method3()
    {
        System.out.println(5/0);
        for(int i=0;i<=10;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("method 3");
    }
}
