package com.FullCreative.intern;

public class Intern {
	public static void main(String[] args) {
		String s="krish";
		s.concat("ss");
		StringBuffer ref=new StringBuffer();
		ref.append("suresh");
		ref.trimToSize();
		ref.setLength(3);
		System.out.println(s);
	}
}
