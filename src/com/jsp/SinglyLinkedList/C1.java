package com.jsp.SinglyLinkedList;

public class C1 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		System.out.println(l);
		l.add(10);
		l.add(20);
		l.add(2,30);
		System.out.println("toString");
		System.out.println(l);
		System.out.println("-----");
		l.display();
		System.out.println("-----");
		l.remove(1);
		l.display();
		System.out.println("-----");
		l.get(0);
		l.display();
		System.out.println("-----");
		System.out.println(l.contains(80));
	}
}
