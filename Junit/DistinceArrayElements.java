import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistinceArrayElements {
	private DistinctOfArrayElements distinct;
	@Before
	public void setUp()
	{
		distinct=new DistinctOfArrayElements();
	}
	@Test
	public void arrayElements() {
		int k=2;
		int distinctArray[]={1,2,3,4,5,1,10,9};
		boolean answer=distinct.isDistictValue(distinctArray,k);
		assertEquals(false,answer);
	}
	
	public void duplicateArray() {
		int k=4;
		int distinctArray[]={1,2,3,4,5,4,10,9};
		boolean answer=distinct.isDistictValue(distinctArray,k);
		assertEquals(true,answer);
	}

}
