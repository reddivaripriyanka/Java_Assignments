import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class OccuranceOfString {
		private OccuranceOfGivenString occurance;
		@Before
		public void setUp()
		{
			occurance=new OccuranceOfGivenString();
		}
	@Test
	public void OccuranceOfString() {
		String names[]={"Dave", "Ann", "George", "Sam","Ted", "Gag", "Saj", "Agati", "Mary", "Sam",
				"Ayan", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown",
				"Davis","Sam"};
			String searchedString="Sam";
		int count=occurance.isOccuacenof(names,searchedString);
		assertEquals(3,count);
		
		}
	
	@Test
	public void OccuranceOfStringMultipleTimes() {
		String names[]={"Dave", "Ann", "George", "Sam","Ted", "Gag", "Saj", "Agati", "Mary", "Sam",
				"Ayan", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown",
				"Davis","Dave"};
			String searchedString="Dave";
		int count=occurance.isOccuacenof(names,searchedString);
		assertEquals(2,count);
		
		}
		
	@Test
	public void OccuranceOfNotStringPresent() {
		String names[]={"Dave", "Ann", "George", "Sam","Ted", "Gag", "Saj", "Agati", "Mary", "Sam",
				"Ayan", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown",
				"Davis","Dave"};
			String searchedString="priyanka";
		int count=occurance.isOccuacenof(names,searchedString);
		assertEquals(0,count);
		
		}
	}


