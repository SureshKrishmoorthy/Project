package com.FullCreative.intern;

public class Stringbuilder {
	public static void main(String[] args) {
		StringBuilder ref=new StringBuilder("FullCreative");
		System.out.println(ref.capacity());//returns the capacity of the string
		System.out.println(ref.charAt(4));//returns the character index
		System.out.println(ref.append(true));//appending the boolean
		System.out.println(ref.append('A'));//appending the character
		System.out.println(ref.hashCode());//returns the hashcode based on the string
		System.out.println(ref.indexOf("v", 2));//returns the index of string from the index you have specified
		System.out.println(ref.substring(2, 6));//trim the string to substring 
		System.out.println(ref.substring(4));//trim the string to substring 
		ref.setCharAt(1, 'Z');//set the character at specific index
		System.out.println(ref);
		System.out.println(ref.insert(2, 6382));//inserts the int value
		System.out.println(ref.insert(5, 66577));//inserts the long value
		ref.ensureCapacity(30);
		System.out.println(ref.capacity());
		System.out.println(ref.deleteCharAt(1));//deletes the character at specific index
		System.out.println(ref.delete(2, 9));
		System.out.println(ref.equals("java"));
	}
}
