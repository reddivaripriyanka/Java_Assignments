import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MultidimensionalArray {
private MultidimensionalOfArray array;
	@Before
	public void setUp()
	{
	array=new MultidimensionalOfArray();
	}
	@Test
	public void SearchElement() {
		int matrix[][]={{1,2,3},{4,10,11}};
		int searchElement=4;
		boolean answer=array.isSearchElement(matrix,searchElement);
		assertEquals(true,answer);
		
		
	}
	
	@Test
	public void SearchElementIsNotPresent() {
		int matrix[][]={{1,2,3},{4,10,11}};
		int searchElement=5;
		boolean answer=array.isSearchElement(matrix,searchElement);
		assertEquals(false,answer);		
		
	}
	

	@Test
	public void SearchElementForNegative() {
		int matrix[][]={{1,2,3},{4,10,11}};
		int searchElement=5;
		boolean answer=array.isSearchElement(matrix,searchElement);
		assertEquals(false,answer);	
	}
}
