package com.FullCreative.intern;

public class Parent {
	String name;
	int age;
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void getDetails() {
		System.out.println("NAME:"+name);
		System.out.println("age: "+age);
	}
}
