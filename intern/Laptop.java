package com.FullCreative.intern;

public class Laptop extends Thread implements Runnable{
		static Thread t;
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
	 Laptop ref=new Laptop();
	 t=new Thread(ref);
	 t.start();
	}
		public void run() {
		System.out.println(t.getState());
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getThreadGroup());
		System.out.println(t.getState());
		System.out.println("**********");
	}
}
