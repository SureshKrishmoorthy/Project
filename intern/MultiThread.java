package com.FullCreative.intern;

public class MultiThread
{
    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
       // Demo d3 = new Demo();
        System.out.println(d1.getName());
        System.out.println(d1.getId());
        d1.start();
        for (int i=1;i<=10;i++)
        {
            System.out.print(i);
        }
        d2.start();
    }
}