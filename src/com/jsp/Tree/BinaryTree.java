package com.jsp.Tree;

public class BinaryTree {
	class Node
	{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	Node root;
	public BinaryTree() {
	}
	public BinaryTree(int data) {
		Node n=new Node(data);
		root=n;
	}
	public void addLeft(Node root, int data)
	{
		Node n=new Node(data);
		root.left=n;
	}
	public void addRight(Node root, int data)
	{
		Node n=new Node(data);
		root.right=n;
	}
	public void preOrder(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public void postOrder(Node root)
	{
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
}
