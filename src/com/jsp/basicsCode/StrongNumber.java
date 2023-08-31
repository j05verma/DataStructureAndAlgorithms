package com.jsp.basicsCode;

import java.util.Scanner;

//145= 1!+4!+5!=145 etc
public class StrongNumber {
	public static boolean isStrongNumber(int n)
	{
		int sum=0, i, fact, remm;
		int temp=n;
		while(temp>0)
		{
			fact=1;
			i=1;
			remm=temp%10;
			while(i<=remm) {
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		for(int i=1; i<=200; i++) {
			boolean rs=isStrongNumber(i);
			if(rs==true)
				System.out.println(i);
		}
		
	}

}
