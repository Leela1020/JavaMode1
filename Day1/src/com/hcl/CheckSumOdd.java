package com.hcl;

public class CheckSumOdd {
	static int i,res=0;
	public static int checkSum(int number)
	{
		while(number!=0)
		{
			i=number%10;
			if(i%2!=0)
			{
				res=res+i;
			}
			number=number/10;
		}
		return res;
		
	}
}
