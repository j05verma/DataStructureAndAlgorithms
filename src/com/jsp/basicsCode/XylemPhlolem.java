package com.jsp.basicsCode;
/*   
    Xylem numbers are numbers whose sum of extreme digits is equal to the sum of its mean digits,
     else it is called a Phloem Number.
     Example : 34326 : 3+6 = 9; 4+3+2= 9 Xylem number 173156 : 1+6 = 7; 7+3+1=11 Phloem number
 */
import java.util.Scanner;

public class XylemPhlolem {
	static String isXylemPhloem(int n) {
		int os = 0, ms = 0;
		os = os + n % 10;
		n = n / 10;
		while (n > 9) {
			ms = ms + n % 10;
			n = n / 10;
		}
		os = os + n;
		if (os == ms)
			return "Xylem";
		else
			return "Phloem";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the number");
		int x = sc.nextInt();
		// isXylemPhloem(x);
		System.out.println(isXylemPhloem(x));

	}

}
