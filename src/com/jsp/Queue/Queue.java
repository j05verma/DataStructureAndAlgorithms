package com.jsp.Queue;

import java.nio.channels.IllegalSelectorException;

public class Queue<T> {
	class Node{
		T data;
		Node next;
		public Node(T data) {
			this.data = data;
		}
	}
	private Node front=null;
	private Node rear=null;
	private int size=0;
	public boolean isEmpty() {
		return front==null;
	}
	public void enqueue(T data)
	{
		Node n=new Node(data);
		if(front==null)
		{
			front=n;
			rear=n;
		}
		else {
			rear.next=n;
			rear=n;
		}
		size++;
	}
	public T dequeue()
	{
		if(isEmpty())
			throw new IllegalStateException();
		T data=front.data;
		front=front.next;
		size--;
		return data;
	}
	public T peek()
	{
		if(isEmpty())
			throw new IllegalStateException();
		return front.data;
	}
	public int search(T data)
	{
		if(isEmpty())
			return -1;
		int pos=1;
		Node pointer=front;
		while(pointer!=null)
		{
			if(pointer.data.equals(data))
				return pos;
			pos++;
			pointer=pointer.next;
		}
		return -1;
	}
	public int size() {
		return size;
	}
}
