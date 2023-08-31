package com.jsp.searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {10,15,28,60,75,83};
		System.out.println("Enter user value to search");
		int userValue=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==userValue) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not Found");
	}

}
