package com.FullCreative.intern;

public class Stringclass1 {
	public static void main(String[] args) {
		String name="fullCreative";
		String ss="Internship";
		char[]ch=name.toCharArray();
		String[] s=name.split("");
		System.out.println(ss.isBlank());//if its whitespace it will return true else false
		System.out.println(name.isEmpty());//if the length is 0
		System.out.println(name.length());
		System.out.println(ss.replace(" ", "Java"));//replaces the word with the another string
		System.out.println(name.toLowerCase());//convert to lower case
		System.out.println(name.toUpperCase());//convert to upper case
		System.out.println(name.toString());
		System.out.println(ss.intern());
		System.out.println(name.substring(2));
		System.out.println(name.substring(3, 6));
		char[] ch1= {'A','b','c','d'};
		System.out.println(name.copyValueOf(ch1));
		System.out.printf(name.format("the number is %d \n", 23));//format the string 
		System.out.printf(name.format("the word is %s", "success\n"));
		System.out.println(name.valueOf(true));
		System.out.println(name.valueOf('s'));
		byte[] b=name.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println(name.startsWith("Full"));
		String val="Full creative";
		System.out.println(val.trim());
	}
}
