package java_assignments;
import java.util.*;
public class MarksOfSubjects
{
  public static void main(String args[])
  {
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter subject1 marks");
	  int subject1=in.nextInt(); //It reads subject1 marks
	  System.out.println("Enter subject2 marks");
	  int subject2=in.nextInt(); //It reads subject2 marks
	  System.out.println("Enter subject3 marks");
	  int subject3=in.nextInt(); //it reads subject2 marks
	  if(subject1>60 && subject2>60 && subject3>60)
	  {
		  System.out.println("Passed");
	  }
	  else if((subject1>60 && subject2>60) || (subject1>60 && subject3>60) || (subject2>60 && subject3>60))
	  {
		  System.out.println("promoted");
	  }
	  else
	  {
		  System.out.println("Failed");
	  }			  			 
  }
}
