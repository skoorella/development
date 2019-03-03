package com.java.prep;

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
	}

}
