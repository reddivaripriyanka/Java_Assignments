package java_assignments;
import java.util.*;
public class Date 
{
	  public static void main(String args[])
	  {
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter date/month/year");
	  String date=in.next(); //It reads date function in the form string
	  int month=in.nextInt(); //It reads month function in the form of integer
	  int year=in.nextInt(); // It reads year in the form of the form of interger
	  String s[]={"","January","Febuary","March","April","May","June","July","August","sepetember","october","november","december"};
	  System.out.println(date+"/"+s[month]+"/"+year);
	  }
}

