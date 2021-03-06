package com.java.linkedlist;

public class JavaLinkedList {
	private Node start;
	private Node end;
	private int size;

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	public void insertAtStart(int data) {
		Node newStartNode = new Node(data, null);
		newStartNode.setLink(start);
		if (start == null) {
			start = newStartNode;
			start.setLink(newStartNode);
			end = start;
		} else {
			end.setLink(newStartNode);
			start = newStartNode;
		}
		size++;
	}

	public void insertAtEnd(int data) {
		Node newEndNode = new Node(data, start);

		if (end == null) {
			start = newEndNode;
			newEndNode.setLink(start);
			end = start;
		} else {
			end.setLink(newEndNode);
			end = newEndNode;
		}

		if (end == null) {
			start = newEndNode;
			end = newEndNode;
			start.setLink(end);
			end.setLink(start);
		} else {
			end = newEndNode;
			end.setLink(start);
		}

		size++;
	}
	
	public Node getNodeAtPos(int pos){
		if( pos > size || pos < 1){
			return null;
		}
		Node node = start;
		for(int i=1; i < size;i++){
			if(i == pos){
				return node;
			}
			node = node.getLink();
		}
		return node;
	}

	public void deleteAtPos(int pos) {
		if(start == null){
			System.out.println("Nothing to delete");
			return;
		}
		
		if(pos <=0 && pos > size){
			System.out.println("Invalid Position. Position should be between 1 and " + size);
			return;
		}
		
		if(pos == 1){
			start = start.getLink();
			end.setLink(start);
		}else if(pos == size){
			//Node at pos-1 position
			end = getNodeAtPos(pos-1);
			end.setLink(start);			
		}else{
			Node posPrev = getNodeAtPos(pos-1);
			Node posPost = getNodeAtPos(pos+1);
			posPrev.setLink(posPost);
		}
		size--;
	}

	public void displayElements() {
		System.out.print("\nCircular Singly Linked List = ");
		Node ptr = start;
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLink() == start) {
			System.out.print(start.getData() + "->" + ptr.getData() + "\n");
			return;
		}
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != start) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "->");
		ptr = ptr.getLink();
		System.out.print(ptr.getData() + "\n");
	}

	public void insertAtPos(int data, int pos) throws Exception {
		Node newNode = new Node(data, null);
		if (pos < 1 || pos > size + 1) {
			throw new Exception("Invalid position. Position should be between 1 and " + size);
		}

		if (start == null || pos == 1) {
			insertAtStart(data);
			return;
		}

		if (pos == size + 1) {
			insertAtEnd(data);
			return;
		}
		
		Node nodeAtPos = getNodeAtPos(pos);
		Node nodePrevPos = getNodeAtPos(pos-1);
		newNode.setLink(nodeAtPos);
		nodePrevPos.setLink(newNode);
//		
//		
//		// pos = pos - 1;
//		Node tempNode = start;
//		for (int i = 1; i < size; i++) {
//			if (i == pos - 1) {
//				Node tmp = tempNode.getLink();
//				tempNode.setLink(newNode);
//				newNode.setLink(tmp);
//				break;
//			}
//			tempNode = tempNode.getLink();
//		}
		size++;
	}

}
