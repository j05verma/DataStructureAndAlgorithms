package com.jsp.Arrays;

import java.util.Scanner;

public class Insert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {5,10,20,30,40};
		int[] temp=new int[arr.length+1];
		System.out.println("how many data added");
		int n=sc.nextInt(); //n-> how many data added
		for(int j=0; j<n; j++) {
			System.out.println("Enter the user index number");
			int userIndex=sc.nextInt();
			System.out.println("Enter user value");
			int userValue=sc.nextInt();
			int index=0;
			for(int i=0; i<temp.length; i++)
			{
				if(i==userIndex)
					temp[i]=userValue; //adding user entered value
				else
					temp[i]=arr[index++]; // index value increment
			}
			arr=temp;
			temp=new int[arr.length+1]; // ready to insert next data
		}
		
		for(int a: arr)
		{
			System.out.print(a+","); // print data
		}
	}

}
