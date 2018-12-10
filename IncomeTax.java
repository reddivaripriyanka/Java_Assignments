import java.util.*;
public class IncomeTax 
{
 	public static void main(String args[])
   	{
		Scanner in=new Scanner(System.in);
	   	int CTC=in.nextInt(); //CTC amount
	   	double taxpercent=0.0;
	   	String slab="";
	  	if(CTC>=0 && CTC<=180000)
	  	{
	     		taxpercent=0.0;
	     		slab="Slab A";
	   	}
	   	else if(CTC>=181001 && CTC<=300000)
	  	 {
		   	taxpercent=10;
		    	slab="Slab B";
	  	 }
	   	else if(CTC>=300001 && CTC<=500000)
	  	 {
		   	taxpercent=20;
		  	slab="Slab C";
	   	}
	   	else if(CTC>=500001 && CTC<=1000000);
	  	 {
			taxpercent=30;
		        slab="Slab A";
	  	 }
	   double taxAmount=(CTC*taxpercent)/100;
	   System.out.println("TaxAmount is:"+taxAmount);
		   	   
	}
}
