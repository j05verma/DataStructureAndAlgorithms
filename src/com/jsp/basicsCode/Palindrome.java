package com.jsp.basicsCode;
// 343 121 1221
// sum of palindrome no. (1 to 100)
public class Palindrome {
	static boolean isPalidrome(int n)
	{
		int rev=0, temp=n;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==temp)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			boolean rs=isPalidrome(i);
			if(rs==true)
				sum=sum+i;
		}
		System.out.println(sum);
	}

}
