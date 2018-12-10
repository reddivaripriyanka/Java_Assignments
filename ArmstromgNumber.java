package java_assignments;

import java.util.Scanner;

public class  Armstromg_Number 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Armstromg_Number a=new  Armstromg_Number();
		boolean r=a.isArmstrongNumber(n);
		if(r==true)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}
	boolean isArmstrongNumber(int n)
	{
		int temp=n;
		int digitcount=digitCount(n); //This function counts the no of digits in the given number
		int sum=0;
		while(n!=0)
		{
			int remainder=n%10;
			sum=sum+isPower(remainder,digitcount); //This function returns the power of the given number
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
