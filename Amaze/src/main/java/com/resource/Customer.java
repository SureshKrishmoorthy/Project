package com.resource;

import java.util.ArrayList;

public class Customer {
	String email;
	String name;
	Long mobile;
	String password;
	int age;
	ArrayList<Integer> list;
	ArrayList<Address> address;
	ArrayList<Integer> order;
	public Customer(String name, Long mobile, String password, int age) {
		this.name = name;
		this.mobile = mobile;
		this.password = password;
		this.age = age;
		list=new ArrayList<>();
		address=new ArrayList<>();
		order=new ArrayList<>();
	}
	public ArrayList<Integer> getList() {
		return list;
	}
	public void setList(Integer i) {
		list.add(i);
	}
	public void setList() {
		order.addAll(list);
		list.removeAll(list);
	}
	public ArrayList<Integer> getOrder() {
		return order;
	}
	public void setOrder(ArrayList<Integer> order) {
		this.order = order;
	}
	public ArrayList<Address> getAddress() {
		return address;
	}
	public void setAddress(Address a) {
		address.add(a);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
