package com.jsp.basicsCode;

import java.util.Scanner;
public class SpecialNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two digit number: ");
	int n=sc.nextInt();
	int d1=n%10;
	int d2=n/10;
	int sum=d1+d2+d1*d2;
	if(sum==n) {
		System.out.println(n+" is special two digit number");
	}
	else {
		System.err.println(n+" is not special two digit nuber");
	}
}
}
