package com.resource;

public class Address {
	String name;
	String address;
	String payment;
	public Address(String name, String address, String payment) {
		super();
		this.name = name;
		this.address = address;
		this.payment = payment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", address=" + address + ", payment=" + payment + "]";
	}
	
}
