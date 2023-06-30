package com.FullCreative.intern;

public class Exception10 implements Runnable{
	public static void main(String[] args) {
		Runnable ref=new Exception10();
		Thread t0=new Thread(ref);
		t0.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		method1();
		method2();
		
	}

	private void method2() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		try {
			System.out.println(5/0);
		}catch(Exception e)
		{
			System.out.println(e);
		}//if exception occurs it will through error
		
	}

	private void method1() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
