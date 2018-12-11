import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeNumberTest {

	private PalindromeOfNumber palindrome;

	@Before
	public void setUp() {
		palindrome = new PalindromeOfNumber();
	}

	@Test
	public void checkForPositiveNumber() {
		boolean answer = palindrome.checkPalindrome(121);
		assertEquals(true, answer);
	}
	
	@Test
	public void checkForNegativeNumber() {
		boolean answer = palindrome.checkPalindrome(-121);
		assertEquals(false, answer);
	}
	
	@Test
	public void singleDigits() {
		boolean answer = palindrome.checkPalindrome(9);
		assertEquals(false, answer);
	}
}
