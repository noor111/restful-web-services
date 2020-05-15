package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String message;
	private String groceryItems;	

	public HelloWorldBean(String message, String groceryItems) {
		this.message = message;
		this.groceryItems = groceryItems;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getGroceryItems() {
		return groceryItems;
	}

	public void setGroceryItems(String groceryItems) {
		this.groceryItems = groceryItems;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	

}
