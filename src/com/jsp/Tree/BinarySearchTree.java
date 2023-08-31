package com.jsp.Tree;

public class BinarySearchTree {
	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node root;

	public BinarySearchTree(int data) {
		Node n=new Node(data);
		root=n;
	}

	public void add(int data) {
		add(root, data);
	}

	public Node add(Node root, int data) {
		if (root == null)
			return new Node(data);
		if (data > root.data)
			root.right = add(root.right, data);
		else
			root.left = add(root.left, data);
		return root;
	}
	public void inOrder() {
		inOrder(root);
	}
	public void inOrder(Node root) {
		if(root==null)
			return ;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
}
