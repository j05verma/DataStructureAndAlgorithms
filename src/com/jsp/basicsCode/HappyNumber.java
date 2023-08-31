package com.jsp.basicsCode;
import java.util.*;
public class HappyNumber {
	public static boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			do {
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}while(n!=0);
		n=sum;
		}
		return n==1||n==7;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		for(int i=1;i<=200;i++)
		{
			boolean rs=isHappy(i);
					if(rs==true)
						System.out.print(i+", ");
		}
		
	}

}
