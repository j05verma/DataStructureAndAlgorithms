package com.jsp.LinkedList;

public class C1 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(50);
		System.out.println("Head Node:->"+l.head.data);
		System.out.println("Tail Node:->"+l.tail.data);
	}
}
