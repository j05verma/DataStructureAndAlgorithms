package com.jsp.LinkedList;

public class LinkedList1 {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
		public Node head;
		public Node tail;
		public int size=0;
		public void insertAtBegin(int data)
		{
			if(head==null) //First Node
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
			size++;
		}
		public void add(int data)
		{
			if(head==null)
			{
				insertAtBegin(data);
			}
			else {
				Node n=new Node(data);
				tail.next=n;
				tail=n;
				size++;
			}
		}
		public int size() {
			return size;
		}
		public void add(int index, int data)
		{
			if(index>=size)
				throw new IndexOutOfBoundsException("Index is out of range");
			else if(index==0)
				insertAtBegin(data);
			else {
				Node n=new Node(data);
				Node pointer=head;
				for (int i = 0; i < index; i++) {
					pointer=pointer.next;
				}
				n.next=pointer.next;
				pointer.next=n;
				size++;
			}
		}
		public void display()
		{
			Node p=head;
			while(p!=null)
			{
				System.out.println(p.data);
				p=p.next;
				
			}
		}
		public int get(int index)
		{
			if(index>size)
				throw new IndexOutOfBoundsException("Index is out of range");
			Node pointer=head;
			for(int i=1; i<=index; i++)
			{
				pointer=pointer.next;
			}
			return pointer.data;
		}
		public void remove(int index)
		{
			if(index>size)
				throw new IndexOutOfBoundsException("Index is out of range");
			else if(index==0)
			{
				removeAtBegining();
			}
			else {
				Node pointer=head;
				Node previousPointer=null;
				for(int i=1; i<=index; i++)
				{
					previousPointer=pointer;
					pointer=pointer.next;
				}
				previousPointer.next=pointer.next;
				if(index==size-1)
					tail=previousPointer;
			}
			size--;
		}
		public void removeAtBegining()
		{
			if(size==1)
			{
				head=null;
				tail=null;
			}
			else
				head=head.next;
		}
		public boolean contains(int data)
		{
			Node pointer=head;
			while(pointer!=null)
			{
				if(data==pointer.data)
					return true;
				pointer=pointer.next;
			}
			return false;
		}
	}

