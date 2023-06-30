package com.FullCreative.intern;

public class Exception2 {
	public static void main(String[] args) {
		String s=null;
		Integer i;
		try {
			i=Integer.parseInt(s);
			System.out.println("exception occurs");
		}catch(NumberFormatException e) {
			System.out.println("Enter the correct value"+e);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Enter a number");
		}
		
		System.out.println("planned stop");
		
	}
}
