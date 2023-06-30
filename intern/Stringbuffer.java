package com.FullCreative.intern;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer ref=new StringBuffer("Fullcreative");//intial capacity is 16
		StringBuffer ref1=new StringBuffer("Java");
		System.out.println(ref.capacity());//returns the capacity of the string
		System.out.println(ref.charAt(4));//returns the character index
		System.out.println(ref.append(true));//appending the boolean
		System.out.println(ref.append('A'));//appending the character
		System.out.println(ref.hashCode());//returns the hashcode based on the string
		System.out.println(ref.indexOf("v", 2));//returns the index of string from the index you have specified
		System.out.println(ref.substring(2, 6));//trim the string to substring 
		System.out.println(ref.substring(4));//trim the string to substring 
		char[] ch= {'f','u','l','l'};
		System.out.println(ref.append(ch));//concat the character array
		System.out.println(ref.insert(2, 23));//insert the int /float value in that index
		System.out.println(ref.insert(2, true));//insert the value in that index
		System.out.println(ref.reverse());//reverse the string
		System.out.println(ref.indexOf("e"));
		System.out.println(ref.capacity());
		ref.trimToSize();//trims the size of the stringbuffer
		System.out.println(ref.capacity());
		System.out.println(ref1.append(23.567));//appends float value
		System.out.println(ref1.append(22.12));//appends double value
		System.out.println(ref1.append(12));//appends int value
		System.out.println(ref1.append(76578389));//appends long value
		ref.setCharAt(1, 'Z');//set the character at specific index
		System.out.println(ref1);
		System.out.println(ref1.insert(2, 6382));//inserts the int value
		System.out.println(ref1.insert(5, 66577));//inserts the long value
		ref1.ensureCapacity(30);
		System.out.println(ref1.capacity());
		System.out.println(ref1.deleteCharAt(1));//deletes the character at specific index
		System.out.println(ref1.delete(2, 9));
		System.out.println(ref1.equals("java"));
		
	}
}
