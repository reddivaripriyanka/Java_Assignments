package java_assignments;
import java.util.*;
public class LinearSearch
{
		public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter no.of elements:");
			int n=in.nextInt();    //Enter no of array elements
			System.out.println("Enter the Elements:");
			int a[]=new int[n];  //array declaration with size n
			for(int i=0;i<a.length;i++)
			{
				a[i]=in.nextInt();      //it reads array elements
		    }
		    System.out.println("Enter the searched element:");
			int k=in.nextInt();   //Enter the searched element
			int i;
		    for(i=0;i<a.length;i++)
		    {
				if(a[i]==k)
				{
			    System.out.println("Searched element is present at "+(i+1)+" th position");
			    break;
				}
		    }
		    if(i==n)  //if element not present then go this statement
		    System.out.println("Searched element is not present");
		  }
	}

