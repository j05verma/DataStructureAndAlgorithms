package com.jsp.basicsCode;

import java.util.Scanner;

public class ArmStrongNumber {
	public static int isCount(int num)
	{
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
	static int isPower(int n, int p)
	{
		int pw=1;
		while(p>0) {
			pw=pw*n;
			p--;
		}
		return pw;
	}
	public static boolean isStrongNumber(int x)
	{
		int ct=isCount(x);
		int t=x, sum=0;
		while(x!=0) {
			int d=x%10;
			sum=sum+isPower(d,ct);
			x=x/10;
		}
		if(sum==t)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		 System.out.println("enter number");
//		 int x=sc.nextInt();
		for(int i=1; i<=500; i++) {
			boolean rs=isStrongNumber(i);
			if(rs==true)
				System.out.print(i+",");
		}
	}

}
