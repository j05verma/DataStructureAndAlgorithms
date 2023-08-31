package com.jsp.SinglyLinkedList;

public class LinkedList {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;
	private int size = 0;

	private void insertAtBegin(int data) {
		if (head == null)// FIRST NODE
		{
			Node n = new Node(data);
			head = n;
			tail = n;
		} else {
			Node n = new Node(data);
			n.next = head;
			head = n;
		}
		size++;
	}

	public void add(int data) {
		if (head == null)
			insertAtBegin(data);
		else {
			Node n = new Node(data);
			tail.next = n;
			tail = n;
		}
		size++;
	}

	public int size() {
		return size;
	}

	public void add(int index, int data) {
		if (index == data) // if index is similar to size
		{
			if (index == 0) // if list is empty
				insertAtBegin(data);
			else // inserting in last
				insertAtLast(data);
		} else if (index > size)
			throw new IndexOutOfBoundsException("Index is out of range");
		else if (index == 0)
			insertAtBegin(data);
		else {
			Node n = new Node(data);
			Node pointer = head;
			for (int i = 1; i < index; i++) {
				pointer = pointer.next;
			}
			n.next = pointer.next;
			pointer.next = n;
		}
		size++;
	}

	public void display() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.data);
			pointer = pointer.next;
		}
	}

	public int get(int index) // Access data
	{
		if (size == 0 || index > size)
			throw new IndexOutOfBoundsException("Index is out of range");
		Node pointer = head;
		for (int i = 1; i <= index; i++)
			pointer = pointer.next;
		return pointer.data;
	}

	public void remove(int index) // delete data
	{
		if (size == 0 || index > size)
			throw new IndexOutOfBoundsException("Index is out of range");
		if (index == 0)
			removeAtBegin();
		else {
			Node pointer = head;
			Node previousPointer = null;
			for (int i = 1; i <= index; i++) {
				previousPointer = pointer;
				pointer = pointer.next;
			}
			previousPointer.next = pointer.next;
			if (index == size - 1) // last index
				tail = previousPointer;
		}
		size--;
	}

	private void removeAtBegin() // delete data 0th index
	{
		if (size == 1) {
			head = null;
			tail = null;
		} else
			head = head.next;
	}

	public boolean contains(int data) // search data
	{
		Node pointer = head;
		while (pointer != null) {
			if (data == pointer.data)
				return true;
			pointer = pointer.next;
		}
		return false;
	}

	public void insertAtLast(int data) // insert data in last node change the tail address
	{
		Node n = new Node(data);
		tail.next = n;
		tail = n;
	}

	@Override
	public String toString()  // print the all data using toString method
	{
		if (head == null) {
			return "Node Empty";
		}
		Node pointer = head; // pointer-> first node
		String temp = "";
		while (pointer!= null) {
			temp=temp+pointer.data+",";
			pointer=pointer.next;
		}
		return temp;
	}
}
