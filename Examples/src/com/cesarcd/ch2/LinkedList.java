package com.cesarcd.ch2;

public class LinkedList {
	Node head;
	
	public void put(int data) {
		Node node = new Node(data);
		
		if (head == null) {
			head = node;
			return;
		} 
		
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = node;
	}
	
	public Node getHead() {
		return this.head;
	}
}

