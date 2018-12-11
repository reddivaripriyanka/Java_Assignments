import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SubstractionOfTwoNumbersTest {
private SubstractionOfTwoNumbers subtraction;
	@Before
	public void setUp()
	{
		subtraction=new SubstractionOfTwoNumbers();
	}
	@Test
	public void firstNumberBigger() 
	{
		int answer=subtraction.substractionOfTwoNumbers(10,5);
		assertEquals(5,answer);	
	}
	
	@Test
	public void secondNumberBigger() 
	{
		int answer=subtraction.substractionOfTwoNumbers(5,10);
		assertEquals(-5,answer);	
	}
	
	@Test
	public void bothNegativeNumbers() 
	{
		int answer=subtraction.substractionOfTwoNumbers(-10,-5);
		assertEquals(-5,answer);	
	}
	
	@Test
	public void oneNegativeOnePositive() 
	{
		int answer=subtraction.substractionOfTwoNumbers(-10,5);
		assertEquals(-15,answer);	
	}
}

