package com.jsp.basicsCode;
/*
    The smallest perfect number is 6, which is the sum of 1, 2, and 3. 
      Other perfect numbers are 28, 496, and 8,128.
 */

import java.util.Scanner;

public class PerfectNumber {
	static boolean isPerfect(int x)
	{
		int sum=0;
		for(int i=1; i<x; i++) {
			if(x%i==0)
				sum=sum+i;
		}
		if(sum==x)
			return true;
		else
			return false;
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	boolean rs=isPerfect(n);
	//if(rs)
	if(rs==true)
	System.out.println(n+" is perfect number");
	else
		System.out.println(n+ " is not perfect number");
	
}
}
