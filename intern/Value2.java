package com.FullCreative.intern;

public class Value2 {
	
	int a;
	protected static int b=12;
	void m1() {
		Value2 ref=new Value2(5,10);
		ref.a=45;
		this.b=33;
		System.out.println(ref.a+"*");
		System.out.println(b+"*");
	}
	 	public Value2(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(b);
		System.out.println(a);
	}
	public static void main(String[] args) {
		Value2 ref=new Value2(5,10);
		ref.m1();
		System.out.println(ref.a);
		System.out.println(ref.b);
		b=22;
		ref.a=35;
		System.out.println(ref.a);
	}
}
