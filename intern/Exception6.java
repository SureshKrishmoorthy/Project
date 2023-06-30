package com.FullCreative.intern;
//checked exception propagation
public class Exception6 {
	public static void main(String[] args) {
		try {
			method1();	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void method1() throws Exception {
		try {
			method2();
			throw new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
	}
	public static void method2() throws Exception{
		try {
			method3();
			throw new NumberFormatException();
		}catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}catch(NumberFormatException a) {
			a.printStackTrace();
		}
	}
    public static void method3() throws Exception{
		throw new ClassNotFoundException();
	}
}
//we should propagate checked exception use throws keyword