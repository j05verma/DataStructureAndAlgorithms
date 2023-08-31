package com.jsp.String;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the sentance");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		String rs=" ";
		for(int i=0; i<ch.length; i++)
		{
			int f=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int l=i-1;
			while(l>=f)
			{
				rs=rs+ch[l];
				l--;
			}
			if(i<ch.length)
			{
				rs=rs+ch[i];
			}
			
		}
		
		System.out.println(rs);
		
	}

}
