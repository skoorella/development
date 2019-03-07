package com.java.linkedlist;

import com.java.linkedlist.JavaLinkedList;

public class JavaLinkedListTest {

	public static void main(String[] args)  throws Exception{
		JavaLinkedList linkedList = new JavaLinkedList();
		
		linkedList.insertAtEnd(5);
		
		linkedList.insertAtEnd(7);
		
		linkedList.insertAtStart(2);
		
		linkedList.insertAtEnd(9);
		
		linkedList.insertAtStart(1);
		
		linkedList.displayElements();
		
		linkedList.insertAtPos(90, 5);
		
		linkedList.displayElements();
		
		linkedList.deleteAtPos(1);
		
		linkedList.displayElements();
		
//		linkedList.deleteAtPos(linkedList.getSize());
		
		linkedList.displayElements();
		
		linkedList.deleteAtPos(3);
		
		linkedList.displayElements();
		
		linkedList.insertAtPos(19, 3);
		
		linkedList.displayElements();
		
	}

}
