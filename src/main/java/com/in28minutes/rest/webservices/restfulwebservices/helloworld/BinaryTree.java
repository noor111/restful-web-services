package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class BinaryTree {
	
	Node root;
	
	public BinaryTree(int key) {
		root = new Node(key);
	}
	
	public BinaryTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
}
