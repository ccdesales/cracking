package com.cesarcd.ch2;

public class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
		
	public Node getNext() {
		return next;
	}
	
	public int getData() {
		return data;
	}
}