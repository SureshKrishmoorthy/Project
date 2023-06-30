package com.FullCreative.intern;

public class Exception3 {
	public static void main(String[] args) {
		try {
			String s=null;
			s.concat("abc");
			try {
				char ch=s.charAt(4);
				System.out.println(ch);
				
			}catch(NullPointerException e) {
				System.out.println(e+"empty String");
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println(e+"Enter a valid number");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
