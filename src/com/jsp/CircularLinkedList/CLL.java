package com.jsp.CircularLinkedList;

public class CLL {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	int size = 0;
	Node tail = null;

	public void insertAtBegin(int data) {
		Node n = new Node(data);
		if (size == 0) {
			n.next = n;
			tail = n;
		} else {
			n.next = tail.next;
			tail.next = n;
		}
	}

	public void insertAtLast(int data) {
		Node n = new Node(data);
		n.next = tail.next;
		tail.next = n;
		tail = n;
	}

	public void add(int data) {
		if (tail == null)
			insertAtBegin(data);
		else
			insertAtLast(data);
		size++;
	}

	public void add(int index, int data) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException("Index out of range");
		if (index == 0)
			insertAtBegin(data);
		else if (index == size)
			insertAtLast(data);
		else {
			Node n = new Node(data);
			Node pointer = tail.next;
			for (int i = 1; i < index; i++) {
				pointer = pointer.next;
				n.next = pointer.next;
				pointer.next = n;
			}
		}
		size++;
	}

	public boolean contains(int data) {
		if (size == 0)
			return false;
		Node pointer = tail.next;
		do {
			if (pointer.data == data)
				return true;
			pointer = pointer.next;
		} while (pointer != tail.next);
		return false;
	}

	public int get(int index) {
		if (index > size || index < 0 || size == 0)
			throw new IndexOutOfBoundsException("Index is out of range");
		Node pointer = tail.next;
		for (int i = 1; i <= index; i++) {
			pointer = pointer.next;
		}
		return pointer.data;
	}
	public void rotateForm(int index) {
		Node start=tail.next;
		for(int i=1; i<=index; i++) {
			start=start.next;
		}
		Node pointer=start;
		do {
			System.out.println(pointer.data);
			pointer=pointer.next;
		}while(pointer!=start);
	}

}
