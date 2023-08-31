package com.jsp.basicsCode;
public class PrimeNumber 
{
	static boolean isPrimeNumber(int x)
	{
		for(int i=2; i<=x/2; i++)
		{
			if(x%2==0)
			return false;
	    }
	      return true;
    }

	public static void main(String[] args) {
	
		
			int sum=0;
			for(int i=1; i<=50; i++)
			{
				boolean rs = isPrimeNumber(i);
				if(rs==true)
					System.out.print(i+",");
					sum=sum+i;
				
			}
			System.out.println("\n"+"Sum of prime Number is=> "+sum);
		}
}
