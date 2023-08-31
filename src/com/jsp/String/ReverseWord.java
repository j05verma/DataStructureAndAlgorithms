package com.jsp.String;
/*
   Entre the sentance  :--> jayant kumar verma
 verma kumar jayant

 */
import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the sentance");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		String rs=" ";
		for(int i=ch.length-1; i>=0; i--)
		{
			int f=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int l=i+1;
			while(l<=f)
			{
				rs=rs+ch[l];
				l++;
			}
			if(i>=0)
			{
				rs=rs+ch[i];
			}
			
		}
		
		System.out.println(rs);
		
	}

}
