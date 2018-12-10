package java_assignments;

import java.util.Scanner;

public class ArmstrongNumberRange 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Armstromg_Number a=new  Armstromg_Number();
		for(int i=100;i<1000;i++)
		{
			if(a.isArmstrongNumber(i))
			System.out.println(i);
		}
	}
	boolean isArmstrongNumber(int n)
	{
		int temp=n;
		int digitcount=digitCount(n);
		int sum=0;
		while(n!=0)
		{
			int remainder=n%10;
			sum=sum+isPower(remainder,digitcount);
			 n=n/10;
		}
	  return sum==temp;
	}
    int digitCount(int n)
    {
    	int c=0;
    	while(n!=0)
    	{
    		n=n/10;
    		c++;
    	}
       return c;
    }
    int isPower(int n,int r)
    {
    	int power=1;
    	while(r!=0)
    	{
    	    power=power*n;
    	    r--;
    	}
    	return power;
    }
}

