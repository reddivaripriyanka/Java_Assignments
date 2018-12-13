import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DeleteSpecifiedWord {
	private DeleteBySpecifiedString specifiedString;
	@Before
		public void setUp()
		{
		specifiedString=new  DeleteBySpecifiedString();
		}
	@Test
	public void removeSpace() {
		String s="This    is priya   is";
		String k="is";
		int p=3;
		String answer=specifiedString.isDelete(s,k,p);
		assertEquals("This is priya ",answer);
		
	}

	@Test
	public void removeOfSpaces() {
		String s="A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.";
		String k="is";
		int p=5;
		String answer=specifiedString.isDelete(s,k,p);
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.",answer);
		
	}
	
	@Test
	public void removeOfSpacesString() {
		String s="AS YOU    SOW, SO   SO YOU REAP.";
		String k="SO";
		int p=4;
		String answer=specifiedString.isDelete(s,k,p);
		assertEquals("AS YOU SOW, SO YOU REAP.",answer);
		
	}
}
