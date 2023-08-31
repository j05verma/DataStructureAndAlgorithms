package com.jsp.basicsCode;

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the int value");
		int n=sc.nextInt();
		int f1=0, f2=1, f3;
		System.out.print(f1+","+f2);
		while(f1<n)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(","+f3);
			if(f3>n)
				System.out.println("\n"+f3);
		}
		
	}

}
