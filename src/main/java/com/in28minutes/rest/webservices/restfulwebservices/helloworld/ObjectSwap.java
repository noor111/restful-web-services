package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class ObjectSwap {
	
	public String str;
	public int num;
	
	public static void swap(ObjectSwap obj1, ObjectSwap obj2) {
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	
		String temp1 = obj1.str;
		obj1.str = obj2.str;
		obj2.str = temp1;	
		
		int temp2 = obj1.num;
		obj1.num = obj2.num;
		obj2.num = temp2;	
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
	}
	
	public String toString() {
		return "===> str: " + str + " , num: " + num;
	}

}
