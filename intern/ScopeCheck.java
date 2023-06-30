package com.FullCreative.intern;

public class ScopeCheck {
	int x;
	static int y;
	static void staticcheck(int yy) {
		y=yy;
		
	}
	public void check(int x) {
		this.x=x;
		System.out.println(x);
	}
	public static void main(String[] args) {
		ScopeCheck ref=new ScopeCheck();
		
		ref.check(10);
		staticcheck(15);
		System.out.println(y);
		System.out.println(ref.x);
		
	}
}
