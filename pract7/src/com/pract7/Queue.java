package com.pract7;

public class Queue {

	private int[] queue;
	private int size;
	private int cElements;
	
	Queue(int size) {
		this.size = size;
		queue = new int[size];
		cElements = -1;
	}
	
	public boolean empty() {
		if (cElements == -1) {
			return true;
		}
		return false;
	}
	
	public boolean full() {
		if (cElements == size - 1) {
			return true;
		}
		return false;
	}
	
	public void push(int vElement) {
		queue[++cElements] = vElement;
	}
	
	public int getElement() {
		int value;
		if (!empty()) {
			value = queue[0];
			for (int i = 0; i < cElements; i++) {
				queue[i] = queue[i+1];
			}
			--cElements;
			return value;
		} else {
			return -1;
		}
	}
	
	public int head() {
		return queue[0];
	}
	
	public int rear() {
		return queue[cElements - 1];
	}
	
}
