package com.FullCreative.intern;
//Unchecked Exception propagation
public class Exception4 {
	public static void main(String[] args) {
		try {
			method1();
		}catch(Throwable e) {
			System.out.println(e+"Exception occurs");
		}
	}
	public static void method1() {
		System.out.println("abc");
		method2();
		System.out.println("method2");
	}
	public static void method2() {
		System.out.println("def");
		method3();
		System.out.println("method2");
	}
	public static void method3() {
		System.out.println("xyz");
		method4();
		System.out.println("method3");
	}
	public static void method4() {
		System.out.println(1/0);
		System.out.println("planned stop");
	}
}
