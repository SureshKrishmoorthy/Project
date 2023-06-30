package com.FullCreative.intern;

public class Child extends Parent{
	String name;
	int age;
	public Child(String name, int age) {
		super("Xyz",30);
		this.name = name;
		this.age = age;
	}
	public void getDetails() {
		System.out.println("NAME:"+name);
		System.out.println("age: "+age);
	}
}
