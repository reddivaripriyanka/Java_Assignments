/*Create classes for the below objects with the fields specified below.
Create three different instances for each type and add them to a collection.
Now, read from these collection and print each attribute in console.*/

//Car : make and model together define equality

package com.collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
/**
 * 
 * @author reddivaripriyanka
 *
 */
public class CarTest {
	private Car carOne,carTwo,carThree,carFour,carFive;


	@Test
	public void printCollectionElements() {
		Set<Car> carSets=new HashSet<Car>();
		carOne=new Car("BMW","600",1957,500000);
		carTwo=new Car("HILLMAN","MINX",1983,450000);
		carThree=new Car("SUZUKI","SJ",2005,640000);
		carFour	=new Car("FORD","E250",1997,250000);
		carFive	=new Car("FORD","E250",1997,250000);
		carSets.add(carOne);
		carSets.add(carTwo);
		carSets.add(carThree);
		carSets.add(carFour);
		String expected="[Car [make=SUZUKI, model=SJ, year=2005, price=640000.0], Car [make=FORD, model=E250, year=1997, price=250000.0], Car [make=BMW, model=600, year=1957, price=500000.0], Car [make=HILLMAN, model=MINX, year=1983, price=450000.0]]";
		assertEquals(expected,carSets.toString());
	}
		@Test
		public void testTwoObjectsAreSame() {
			carOne=new Car("BMW","600",1957,500000);
			carTwo=new Car("HILLMAN","MINX",1983,450000);
			carThree=new Car("SUZUKI","SJ",2005,640000);
			carFour	=new Car("FORD","E250",1997,250000);
			carFive	=new Car("FORD","E250",1998,300000);
			boolean result=carFour.equals(carFive);
			assertEquals(true,result);
		}
		
		@Test
		public void testTwoObjectsAreNSame() {
			carOne=new Car("BMW","600",1957,500000);
			carTwo=new Car("HILLMAN","MINX",1983,450000);
			carThree=new Car("SUZUKI","SJ",2005,640000);
			carFour	=new Car("FORD","E250",1997,250000);
			carFive	=new Car("FORD","E250",1998,300000);
			boolean result=carFour.equals(carFive);
			assertEquals(true,result);
		}
	
	

}
