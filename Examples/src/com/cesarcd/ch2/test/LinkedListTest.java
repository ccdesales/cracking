package com.cesarcd.ch2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cesarcd.ch2.LinkedList;
import com.cesarcd.ch2.Node;

class LinkedListTest {

	@Test
	void testPut() {
		LinkedList list = new LinkedList(); 
		
		list.put(1);
		list.put(3);
		list.put(5);
		
		Node node = list.getHead();
		assertEquals(node.getData(), 1);
		
		node = node.getNext();
		assertEquals(node.getData(), 3);
		
		node = node.getNext();
		assertEquals(node.getData(), 5);
	}
}
