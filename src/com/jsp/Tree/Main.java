package com.jsp.Tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree(5);
		b.addLeft(b.root, 10);
		b.addRight(b.root, 70);
		b.addLeft(b.root.left, 12);
		b.addLeft(b.root.left.left, 6);
		b.addRight(b.root.left.left, 7);
		b.addRight(b.root.right, 60);
		b.addLeft(b.root.right.right, 100);
		b.addRight(b.root.right.right, 17);
		System.out.println("PreOrder");
		b.preOrder(b.root);
		System.out.println("\n"+"InOrder");
		b.inOrder(b.root);
		System.out.println("\n"+"PostOrder");
		b.postOrder(b.root);
	}

}
