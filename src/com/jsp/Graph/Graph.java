package com.jsp.Graph;

import java.util.ArrayList;

public class Graph {
	ArrayList<ArrayList<Integer>> al=new  ArrayList<>();
	public Graph(int vertex) {
		for(int i=1; i<=vertex; i++) {
			al.add(new ArrayList<>());
		}
	}
	public void addEdge(int v1, int v2) {
		al.get(v1).add(v2);
		al.get(v2).add(v1);
	}
	public void getAdjVertices(int vertex) {
		ArrayList a=al.get(vertex);
		for(int i=0; i<a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
	}
	public void getEdges() {
		for(int j=0; j<al.size(); j++) {
			System.out.println("Vertices of "+ j);
			ArrayList a=al.get(j);
			for(int i=0; i<a.size(); i++) {
				System.out.print(a.get(i)+" ");
				System.out.println();
			}
		}
	}

}
