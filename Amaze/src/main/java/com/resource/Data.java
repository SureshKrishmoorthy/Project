package com.resource;

import java.util.HashMap;

public class Data {
	 public static HashMap<String,Customer> map=new HashMap<>();
	static{
		map.put("suresh@gmail.com", new Customer("suresh", 9798687688L,"suresh",23));
	}
}
