package com.FullCreative.intern;

import java.util.Scanner;

public class Eligibility {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your age:");
		try {
			Eligible(in.nextInt());
		}catch(AllowedException | NotAllowedException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
	}
	public static void Eligible(int age) throws AllowedException, NotAllowedException {
		if(age<18)
			throw new NotAllowedException();
		else
			throw new AllowedException();
	}
}
