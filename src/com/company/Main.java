package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//	 ArrayStack stack =  new ArrayStack(5);
//	 stack.push(5);
//	 stack.push(10);
//	 stack.push(15);
//	 stack.push(20);
//	 stack.push(25);
//	 stack.push(30);
//	 stack.push(35);
//
//		stack.pop();
//		System.out.println(stack.peek());
//		System.out.println(stack.isEmpty());
//
//		ArrayListStack listStack =  new ArrayListStack();
//		listStack.push(10);
//		listStack.push(20);
//		listStack.push(30);
//		listStack.push(40);
//		System.out.println(listStack.search(50));
//		listStack.pop();

		LinkedListStack linkedListStack =  new LinkedListStack();
		linkedListStack.push(10);
		linkedListStack.push(20);
		linkedListStack.push(30);
		linkedListStack.push(40);
		System.out.println(linkedListStack.search(20));
		linkedListStack.pop();






	}
}
