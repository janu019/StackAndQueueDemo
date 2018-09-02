package com.jana.demo.stack.impl.with.array;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		System.out.println("Should be empty : " + stack.isEmpty());
		System.out.println("Should not be full : " + stack.isFull());
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		System.out.println("Top Should be 'C' : " + stack.top());
		System.out.println("Should be full : " + stack.isFull());
		System.out.println("Popping " + stack.pop() + " From Stack");
		System.out.println("Popping " + stack.pop() + " From Stack");
		System.out.println("Popping " + stack.pop() + " From Stack");
		System.out.println("Should be empty : " + stack.isEmpty());
		System.out.println("Should not be full : " + stack.isFull());
		//Should throw StackEmptyException
		System.out.println(stack.pop());
	}

}
