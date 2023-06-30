package collection.framework.List;

import java.util.ArrayList;

public class ArrayListThread implements Runnable{
    static ArrayList list;
    public static void main(String[] args) throws InterruptedException {
        list=new ArrayList();
        list.add(12);
        list.add(42);
        list.add(52);
        list.add(23);
        ArrayListThread ref=new ArrayListThread();
        Thread t0=new Thread(ref);
        Thread t1=new Thread(ref);
        Thread t2=new Thread(ref);
        t0.start();
        t1.start();
        t2.start();
        System.out.println(list);
        System.out.println(list);

    }

    @Override
    public void run() {
        list.set(2,23);
    }



}
