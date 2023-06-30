package com.FullCreative.intern;

import java.util.LinkedList;

public class Value1 {
	int a;
	static int b;
	Value1(){
		this.a=29;
		this.b=88;
	}
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
//		Value1 ref=new Value1();
//		ref.a=22;
//		int a;
//		{
//			a=10;
//		}
//		System.out.println(a);
//		System.out.println(ref.b);
//		System.out.println(ref.a);
		LinkedList list=new LinkedList();
		list.add(12);
		System.out.println(list.get(7));
	}
}
