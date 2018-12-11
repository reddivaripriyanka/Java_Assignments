import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ReverseCharacterTest {
	private ReverseCharacter reverse;

	@Before
	public void setUp() {
		reverse = new ReverseCharacter();
	}

	@Test
	public void ReverseCharacter() {
		String answer=reverse.reverseCharacter("Let's take LeetCode contest");
		assertEquals("s'teL ekat edoCteeL tsetnoc",answer);
	}

	

}
