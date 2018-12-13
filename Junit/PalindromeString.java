import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PalindromeString {
	private PalindromeOfString palindrome;

	@Before
	public void setUp() {
		palindrome = new PalindromeOfString();
	}
	
	@Test
	public void palindromeOfNumer()
	{
		String palindromeArray[]={"amma","priya","nitin","anna"};
		String expected[]={"amma","nitin","anna"};
		int number[]={4,5,4};
		String answer[]=palindrome.isPalindrome(palindromeArray);
		int length[]=palindrome.isLength(answer);
		assertArrayEquals(expected,answer);
		assertArrayEquals(number,length);
		
	}
	


}
