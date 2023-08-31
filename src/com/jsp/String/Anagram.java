package com.jsp.String;
// Input: str1 = “listen”  str2 = “silent”
// Explanation: All characters of “listen” and “silent” are the same.
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String x = sc.nextLine();
		System.out.println("Enter 2nd string");
		String y = sc.nextLine();
		
		x = x.replace(" ", ""); // remove space
		y = y.replace(" ", "");
		x = x.toLowerCase();
		y = y.toLowerCase();
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result=Arrays.equals(a, b);
		if(result==true)
			System.out.println("String are Anagram");
		else
			System.out.println("String are not Anagram");
	}
}
