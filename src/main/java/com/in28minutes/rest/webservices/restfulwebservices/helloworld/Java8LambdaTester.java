package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;

public class Java8LambdaTester {
	
	public static void main(String args[]) {
		
		Java8LambdaTester tester = new Java8LambdaTester();	
		
		System.out.println("*********************************************************************");
		System.out.println("**  Test Lambda Expressions using custom MathOperation interface");
		System.out.println("*********************************************************************");
		
		MathOperation addition = (a, b) -> a + b;
		
		MathOperation divisison = (a, b) -> a / b;
		
		MathOperation multiply = (a, b) -> a * b;
		
		System.out.println(tester.operate(5, 7, addition));  // 12
		
		System.out.println(tester.operate(15, 3, divisison));  // 5
		
		System.out.println(tester.operate(8, 4, multiply));  // 32		
		
		System.out.println("*********************************************************************");
		System.out.println("**  Test Lambda Expressions using Runnable");
		System.out.println("*********************************************************************");
		
		Runnable runnable = () -> System.out.println("This is testing code within Runnable created as Lambda expression");
		
		runnable.run();
		
		System.out.println("*********************************************************************");
		System.out.println("**  Test Lambda Expressions using Comparator with Collections.sort()");
		System.out.println("*********************************************************************");
		
		User user1 = new User(1, "James", new Date(1965, 5,18));
		User user2 = new User(2, "Albert", new Date(1965, 5,18));
		User user3 = new User(3, "Charles", new Date(1965, 5,18));
		User user4 = new User(4, "Cynthia", new Date(1965, 5,18));
		User user5 = new User(5, "Harold", new Date(1965, 5,18));
		
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		System.out.println("===> Ascending sort");
		Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
		
		for (User user : users) {
			System.out.println(user.getName());
		}
		
		System.out.println("===> Descending sort");
		Collections.sort(users, (u1, u2) -> u2.getName().compareTo(u1.getName()));
		
		for (User user : users) {
			System.out.println(user.getName());
		}
		
	}	
	
	public int operate(int a, int b, MathOperation functionMathOperation) {
		return functionMathOperation.operation(a, b);
	}

}
