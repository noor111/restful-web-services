package com.in28minutes.rest.webservices.restfulwebservices;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.BinaryTree;
import com.in28minutes.rest.webservices.restfulwebservices.helloworld.Node;

public class BinaryTreeTests {
	
	@Test
	public void buildSampleBinaryTree() {
		
		BinaryTree tree = new BinaryTree();
		
		tree.setRoot(new Node(1));
		
		tree.getRoot().setLeft(new Node(2));
		tree.getRoot().setRight(new Node(3));
		
		tree.getRoot().getLeft().setLeft(new Node(4));
		tree.getRoot().getLeft().setRight(new Node(5));
	}

}
