package com.jsp.Graph;

public class Main {
	public static void main(String[] args) {
		Graph g=new Graph(6);
		g.addEdge(1, 2);
		g.addEdge(1, 0);
		g.addEdge(2, 3);
		g.addEdge(2, 5);
		g.addEdge(3, 0);
		g.addEdge(3, 4);
		g.addEdge(0, 4);
		g.getAdjVertices(3);
		g.getEdges();
	}

}
