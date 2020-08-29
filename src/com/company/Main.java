package com.company;

public class Main {

    public static void main(String[] args) {
	 ArrayStack stack =  new ArrayStack(5);
	 stack.push(5);
	 stack.push(10);
	 stack.push(15);
	 stack.push(20);
	 stack.push(25);
	 stack.push(30);
	 stack.push(35);

		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());


    }
}
