package com.jsp.basicsCode;

import java.util.*;
public class SumOfDigit {
		static int isSumofDigit(int x)
		{
			int sum=0;
			while(x!=0)
			{
				int d=x%10;
				sum=sum+d;
				x=x/10;
			}
			return sum;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the int value");
			int n=sc.nextInt();
			int sm=isSumofDigit(n);
			System.out.println(n+" Sum of digit is: "+sm);
		}
}
