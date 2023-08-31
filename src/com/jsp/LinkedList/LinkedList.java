package com.jsp.LinkedList;

public class LinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
		public Node head;
		public Node tail;
		
		public void insertAtBegin(int data)
		{
			if(head==null) // First Node
			{
				Node n=new Node(data);
				head=n;
				tail=n;
			}
			else {
				Node n=new Node(data);
				n.next=head;
				head=n;
			}
		}
		public void add(int data)
		{
			if(head==null)
			{
				insertAtBegin(data);
			}
			else {
				Node n=new Node(data);
				n.next=tail;
				tail=n;
		}
	}
}
