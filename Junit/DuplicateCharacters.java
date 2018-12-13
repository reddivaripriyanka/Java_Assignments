import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DuplicateCharacters {
	private DeleteDuplicateCharacters duplicte;
	@Before
		public void setUp()
		{
		duplicte=new  DeleteDuplicateCharacters();
		}
	
	@Test
	public void duplicateCharacter() {
		String string="abcabcabc";
		String answer=duplicte.isString(string);
		assertEquals("abc",answer);
	}
	
	@Test
	public void duplicateCharacters() {
		String string="javaforschool";
		String answer=duplicte.isString(string);
		assertEquals("javforschl",answer);
	}
	
	@Test
	public void duplicateCharactersOfString() {
		String string="Mississippi";
		String answer=duplicte.isString(string);
		assertEquals("Misp",answer);
	}

}
