package com.jsp.DoublyLinkedList;

public class C1 {
	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		// System.out.println(dl.size);
		dl.add(60);
		dl.add(61);
		dl.add(62);
		dl.add(63);
//		dl.printFor();
//		System.out.println("\n");
//		dl.printBack();
		dl.add(0, 120);
		dl.add(2, 12);
		dl.printFor();
		
//		dl.add(64);
//		dl.add(6,99);
	//	dl.add(1, 123);
	//	dl.printNext();
		//System.out.println("-------");
	//	dl.printNext();
		
	}

}
