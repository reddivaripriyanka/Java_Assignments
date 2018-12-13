import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MissingNumber {
private MissingOfNumber number;
@Before
	public void setUp()
	{
		number=new MissingOfNumber();
	}
	@Test
	public void missingNumber() {
		int missingNumber[]={3,0,1};
		int answer = number.findMissing(missingNumber);
		assertEquals(2,answer);
	}

	@Test
	public void missingNumberWithValues() {
		int missingNumber[]={9,6,4,2,3,5,7,0,1};
		int answer = number.findMissing(missingNumber);
		assertEquals(8,answer);
	}
}
