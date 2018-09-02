package com.jana.demo.queue.impl.with.array;

public class Queue {
	private final int MAX_SIZE = 3;
	public char[] array = new char[MAX_SIZE];
	public int size = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == MAX_SIZE;
	}
	
	
}
