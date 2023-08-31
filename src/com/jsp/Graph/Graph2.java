package com.jsp.Graph;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Graph2 {
	LinkedHashMap<String, ArrayList<String>> m = new LinkedHashMap<>();

	public void addVertex(String vertex) {
		m.put(vertex, new ArrayList<>());
	}

	public void addEdges(String v1, String v2) {
		m.get(v1).add(v2);
		m.get(v2).add(v1);
	}

	public void getAdjVet(String vertex) {
		ArrayList al = m.get(vertex);
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
	}
}
