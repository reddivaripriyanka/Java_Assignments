import static org.junit.Assert.*;

import org.junit.Test;


public class PersonTest {
public Person personOne;


	@Test
	public void display() {
		Person dateOne=new Person("Shyam", 2, 3, 1997);
		String result=dateOne.isDisplay(dateOne);
		assertEquals("Shyam231997",result);
		
	}
	
	@Test
	public void ToFindOlderOne() {
		Person dateOne=new Person("Shyam", 2, 3, 1997);
		String result=dateOne.olderOne(dateOne);
		assertEquals("Ram is older than Shyam by 2 years, 2 months, 1 day",result);
		
	}
	
	
	@Test
	public void ToFineOlderOneBetweenTwoDates() {
		Person dateOne=new Person("Priyanka", 2, 3, 1998);
		String result=dateOne.olderOne(dateOne);
		assertEquals("Ram is older than Priyanka by 3 years, 2 months, 1 day",result);
		
	}
	


}
