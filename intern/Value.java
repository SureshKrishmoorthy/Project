package com.FullCreative.intern;

public class Value
{
	protected static int x = 11;
	 int y = 33;
	public void method1(int x)
	{
		Value t = new Value();
		this.x = 22;
		t.y = 44;

		System.out.println("Value.x: " + Value.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " +y);
	}

	public static void main(String args[])
	{
		Value t = new Value();
		
		t.method1(5);
		System.out.println(x);
	}
}

