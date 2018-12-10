import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number:");
		float oneNumber=in.nextFloat();
		System.out.println("Enter second number:");
		float twoNumber=in.nextFloat();
		System.out.println("Addition of two numbers:"+addition(oneNumber,twoNumber));
		System.out.println("Subtraction of two number:"+substraction(oneNumber,twoNumber));
		System.out.println("Multiplication of two numbers:"+multiplication(oneNumber,twoNumber));
		System.out.println("Division of two numbers:"+division(oneNumber,twoNumber));
		System.out.println("Modules of two numbers:"+modulus(oneNumber,twoNumber));
	}
	static float addition(float numberOne,float numberTwo)
	{
		return numberOne+numberTwo;
	}
	static float substraction(float numberOne,float numberTwo)
	{
		return numberOne-numberTwo;
	}
	static float multiplication(float numberOne,float numberTwo)
	{
		return numberOne*numberTwo;
	}
	static float division(float numberOne,float numberTwo)
	{
	 	return numberOne/numberTwo;
	}
	static float modulus(float numberOne,float numberTwo)
	{
		return numberOne%numberTwo;
	}
}