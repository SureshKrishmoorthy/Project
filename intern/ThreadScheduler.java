package com.FullCreative.intern;

public class ThreadScheduler
{
    public static void main(String[] args)
    {
    SampleThread1 st1 = new SampleThread1();
    SampleThread1 st2 = new SampleThread1();

        st1.setName("SampleThread1");
        st2.setName("SampleThread2");
        st1.setPriority(4);
        st2.setPriority(1);
        System.out.println(Thread.currentThread());
    st1.start();
        System.out.println(Thread.currentThread().getState());
    st2.start();


    }

}
