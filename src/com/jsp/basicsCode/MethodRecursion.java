package com.jsp.basicsCode;

public class MethodRecursion {
	public static void main(String[] args) {
		
		m1();
		System.out.println("m1-start");
	}

	public static void m1() {
		m1();
	}
}
