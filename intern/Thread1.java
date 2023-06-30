package com.FullCreative.intern;

public class Thread1 extends Thread{
	static Thread1 thread2;
	public synchronized void run() {
		try {
			loop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Thread1 thread1=new Thread1();
		thread2=new Thread1();
		thread1.setPriority(5);
		thread2.setPriority(8);
		thread1.setName("My Thread");
		thread2.setName("Thread executer");
		thread1.start();
		thread2.start();
		System.out.println(thread1.getState()+"***");
		try {
			thread2.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println(thread1.isAlive());
		System.out.println(Thread.MAX_PRIORITY);//10
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.NORM_PRIORITY);//5
		
	}
    public synchronized void loop() throws InterruptedException {
    	thread2.yield();
    	for (int i = 0; i < 10; i++) {
    		Thread.sleep(100);
    		System.out.println("Id :"+Thread.currentThread().getId()+":"+i);
			System.out.println("Name :"+Thread.currentThread().getName() +":"+i);
			System.out.println(Thread.currentThread().getPriority()+":"+i);
		}
    	System.out.println(thread2.isInterrupted());//check whether the thread is interuppted or not
    	System.out.println(thread2.interrupted()+"*");//check whether the current thread is interuppted
    }
}
