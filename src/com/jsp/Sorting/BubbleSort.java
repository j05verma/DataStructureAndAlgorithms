package com.jsp.Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 6, 4, 2, 13, 54, 1 };
		int n = arr.length - 1;
		for (int i = 0; i <n; i++) {   //Ascending order
			for (int j = 0; j < n-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a+" ");
		}
	}
}

/*
     for (int i = 0; i <n; i++) {   //Descending order
			for (int j = 0; j < n-i; j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
 */



