package com.FullCreative.intern;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=0;
		try {
			System.out.println(a/b);
			System.out.println("The answer is:");
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Enter the valid number");
		}
		finally {
			System.out.println("Please check the number");
		}
		System.out.println("Planned stop");
	}

}
