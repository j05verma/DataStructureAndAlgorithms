package com.jsp.Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 9,12, 7, 1, 3 }; // assume i=0 already sorted
		for (int i = 1; i < arr.length; i++) {
			int k = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > k) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = k;
		}
		for (int a : arr) {
			System.out.print(a+" ");
		}
	}

}
