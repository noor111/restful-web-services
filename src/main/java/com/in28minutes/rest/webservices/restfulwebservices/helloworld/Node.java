package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class Node {
	
	private int key;
	private Node left;
	private Node right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	
	
}
