package com.jsp.Arrays;

import java.util.Scanner;

public class Delete {
	public static void main(String[] args) {
		int[] arr= {10,15,20,25,30};
		int[] temp=new int[arr.length-1];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index value");
		int userIndex=sc.nextInt();
		int index=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i!=userIndex)
				temp[index++]=arr[i];
		}
		arr=temp;
		for(int a: arr)
		{
			System.out.print(a+",");
		}
	}

}
