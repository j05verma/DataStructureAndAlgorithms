package com.jsp.searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int[] arr = { 5, 10, 15, 20, 25, 30 };
		int k = sc.nextInt(), l = 0, h = arr.length - 1;
		// l-> lowest index h-> highest index
		while (l <= h) {
			int mid = l + (h - l) / 2; //find mid index
			if (k == arr[mid]) {
				System.out.println("Found");
				return;
			} else if (k > arr[mid]) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		System.out.println("NOT FOUND");
	}

}
