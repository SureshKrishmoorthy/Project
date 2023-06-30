package com.FullCreative.intern;

public class EncapDriver {
	public static void main(String[] args) {
		Encap ref=new Encap(8796556,"Suresh",22);
		System.out.println(ref.getBal());
		ref.setBal(78779);
		System.out.println(ref.getBal());
	}
}
