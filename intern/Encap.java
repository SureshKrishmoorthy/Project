package com.FullCreative.intern;

public class Encap {
	private long bal=0;
	String name;
	int age;
	public Encap(long bal, String name, int age) {
		super();
		this.bal = bal;
		this.name = name;
		this.age = age;
	}
	public long getBal() {
		return bal;
	}
	public void setBal(long bal) {
		this.bal = bal;
	}
	
}
