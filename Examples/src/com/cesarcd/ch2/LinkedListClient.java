package com.cesarcd.ch2;

public class LinkedListClient {
	public void useLinkedList() {
		LinkedList list = new LinkedList();
		list.put(1);
		list.put(3);
		list.put(5);
		list.put(7);
		list.put(9);
		
		Node node = list.getHead();
		System.out.println(node.getData());
		while (node.next != null) {
			node = node.next;
			System.out.println(node.getData());
		}
	}
	
	public static void main(String ss[]) {
		LinkedListClient client = new LinkedListClient();
		client.useLinkedList();
	}
}
