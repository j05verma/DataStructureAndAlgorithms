package com.jsp.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(15);
	//	q.dequeue();
		System.out.println(q.peek());
		System.out.println(q.search(20));
	}
}
