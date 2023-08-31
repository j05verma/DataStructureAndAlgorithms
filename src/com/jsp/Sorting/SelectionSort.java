package com.jsp.Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 7, 3, 8, 2, -1, 5, -10, 9 };
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;  // to store the lowest data's index
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index = j; // selecting the index
				}
			}
			int temp = arr[i]; // once index is selected swap it
			arr[i] = arr[index];
			arr[index] = temp;
		}
		for (int a : arr) {
			System.out.print(a + " "); // print data
		}
	}

}
