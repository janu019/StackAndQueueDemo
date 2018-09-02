package com.jana.demo.stack.impl.with.array;

public class Stack {
	private final int MAX_SIZE = 3;
	public char[] array = new char[MAX_SIZE];
	public int size = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == MAX_SIZE;
	}

	public boolean push(char c) {
		if (isFull()) {
			System.out.println("StackFullException");
			return false;
		}

		System.out.println("Pushing " + c + " to the stack");
		array[size++] = c;
		return true;
	}

	public char pop() {
		if (isEmpty()) {
			throw new RuntimeException("StackEmptyException");
		}

		char c = array[size - 1];
		size--;
		// Assign it to null - so that the reference get Garbage collected
		// array[size -1] = null;
		return c;
	}

	public char top() {
		if (isEmpty()) {
			throw new RuntimeException("StackEmptyException");
		}

		return array[size - 1];
	}

}
