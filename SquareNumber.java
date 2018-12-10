package java_assignments;

import java.util.Scanner;
public class SquareNumber 
{
		public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			SquareNumber s=new SquareNumber();
			s.isSquareNumberOf(n);
		}
	  void isSquareNumberOf(int n)  //It prints the square table for the number
	  {
		  for(int i=1;i<=10;i++)
		  {
			  int r=n*i;
			  int k=r*r;
			  System.out.println(n+"*"+i+"="+r+"-------"+k);
		  }
	  }
}
