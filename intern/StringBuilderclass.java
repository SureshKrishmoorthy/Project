package com.FullCreative.intern;

public class StringBuilderclass {
	public static void main(String[] args) {
		StringBuilder ref=new StringBuilder("FullCreative");
		char[] ch= {'f','u','l','l'};
		System.out.println(ref.append(ch));//concat the character array
		System.out.println(ref.insert(2, 23));//insert the int /float value in that index
		System.out.println(ref.insert(2, true));//insert the value in that index
		System.out.println(ref.reverse());//reverse the string
		System.out.println(ref.indexOf("e"));
		System.out.println(ref.capacity());
		ref.trimToSize();//trims the size of the stringbuffer
		System.out.println(ref.capacity());
		System.out.println(ref.capacity());
		System.out.println(ref.append(23.567));//appends float value
		System.out.println(ref.append(22.12));//appends double value
		System.out.println(ref.append(12));//appends int value
		System.out.println(ref.append(76578389));//appends long value
		
	}
}
