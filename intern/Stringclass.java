package com.FullCreative.intern;

public class Stringclass {
	public static void main(String[] args) {
		String str=new String("FullCreative");
		String name="FullCreative";
		String ss=" ";
		System.out.println(str==name);
		System.out.println(name.charAt(2));//returns the character at specific index
		System.out.println(name.codePointAt(4));//returns the ASCI value
		System.out.println(name.codePointBefore(4));//returns the ASCI value before index
		System.out.println(name.compareTo("fullcreative"));//compares lexographical value
		System.out.println(name.compareToIgnoreCase("fullcreative"));
//		System.out.println(name.concat("intern"));
		System.out.println(name.contains("Full"));//check whether contains that word or not charsequence
		System.out.println(name.contentEquals("FullCreative"));//equals the content with case CharSequence
		System.out.println(name.contentEquals("Fullcreative"));//equals the content with case StringBuffer
		System.out.println(name.endsWith("ve"));//check the string endswith or not
		System.out.println(name.equals(str));
		System.out.println(name.equalsIgnoreCase("fullcreative"));//Ignores the case
		System.out.println(name.hashCode());//generates hashcode
		System.out.println(name.indexOf(70));
		System.out.println(name.indexOf("F"));
	
	}
}
