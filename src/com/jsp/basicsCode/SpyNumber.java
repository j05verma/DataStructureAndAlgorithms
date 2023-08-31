package com.jsp.basicsCode;
/*   
      Spy Number Explanation :  sum = (1 + 4 + 1 + 2) = 8 product = (1 * 4 * 1 * 2) = 8 
      since, sum == product == 8
 */

import java.util.*;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum = 0, mul = 1;
		int t = n;
		do {
			int r = t % 10;
			sum = sum + r;
			mul = mul * r;
			t = t / 10;
		} while (t != 0);
		if (sum == mul) {
			System.out.println(n + " is spy number");
		} else {
			System.out.println(n + " is not spy number");
		}

	}

}
