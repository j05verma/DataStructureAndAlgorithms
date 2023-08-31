package com.jsp.DoublyLinkedList;

public class DoublyLinkedList {
	class Node {
		int data;
		Node next;
		Node previous;

		public Node(int data) {
			this.data = data;
		}
	}
	private Node head;
	private Node tail;
	private int size=0;
	public void insertAtBegin(int data)
	{
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			n.next=head;
			head.previous=n;
			head=n;
		}
	}
	public void insertAtLast(int data) {
		Node n=new Node(data);
		n.previous=tail;
		tail.next=n;
		tail=n;
	}
	public void add(int data)
	{
		if(size==0)
			insertAtBegin(data);
		else
			insertAtLast(data);
		size++;
	}
	public void printFor()
	{
		Node pointer=head;
		while(pointer!=null)
		{
			System.out.print(pointer.data+" ");
			pointer=pointer.next;
		}
	}
	public void printBack()
	{
		Node pointer=tail;
		while(pointer!=null)
		{
			System.out.print(pointer.data+" ");
			pointer=pointer.previous;
		}
	}
	public void add(int index, int data)
	{
		if(index<0 || index>size)
			throw new IndexOutOfBoundsException("Index is out of range");
		if(index==0)
			insertAtBegin(data);
		else if(index==size)
			insertAtLast(data);
		else {
			Node n=new Node(data);
			Node pointer=head;
			for (int i = 1; i < index; i++) {
				pointer=pointer.next;
			}
			n.previous=pointer;
			n.next=pointer.next;
			pointer.next=n;
			n.next.previous=n;
		}
		size++;
	}
}
