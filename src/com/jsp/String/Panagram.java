package com.jsp.String;
// string contains all alphabet character
// ex-> The quick brown fox jumps over the lazy dog
// Contains all the characters from ‘a’ to ‘z’
import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentance");
		String str=sc.nextLine();
		System.out.println(isPanagram(str.toLowerCase()));
	}
	public static boolean isPanagram(String str)
	{
		if(str.length()<26) {
			return false;
		}else {
			for (char ch = 'a'; ch < 'z'; ch++) {
				if(str.indexOf(ch)<0)
				{
					return false;
				}
			}
		}
		return true;
	}
}
